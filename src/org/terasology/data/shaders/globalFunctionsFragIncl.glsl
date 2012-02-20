float tonemapReinhard(vec4 color, float brightMax, float exposure) {
    float Y = dot(vec4(0.30, 0.59, 0.11, 0.0), color);
    return exposure * (exposure/brightMax + 1.0) / (exposure + 1.0);
}

float calcLambLight(vec3 normal, vec3 lightVec) {
    return dot(normal,lightVec);
}

float calcSpecLightWithOffset(vec3 normal, vec3 lightVec, vec3 eyeVec, float exp, vec3 offset) {
    vec3 halfWay = normalize(eyeVec+lightVec+vec3(offset.x, offset.y, 0.0));
    return pow(clamp(dot(halfWay, normal), 0.0, 1.0), exp);
}

float calcSpecLight(vec3 normal, vec3 lightVec, vec3 eyeVec, float exp) {
    vec3 halfWay = normalize(eyeVec+lightVec);
    return pow(clamp(dot(halfWay, normal), 0.0, 1.0), exp);
}

float calcTorchlight(float light, vec3 lightPos) {
    return light * clamp(1.0 - (length(lightPos) / 16.0), 0.0, 1.0);
}

vec4 srgbToLinear(vec4 color) {
    return pow(color, vec4(1.0 / GAMMA));
}

vec4 linearToSrgb(vec4 color) {
    return pow(color, vec4(GAMMA));
}

float expLightValue(float light) {
    return light;
}

float timeToTick(float time, float speed) {
    return time * 4000.0 * speed;
}