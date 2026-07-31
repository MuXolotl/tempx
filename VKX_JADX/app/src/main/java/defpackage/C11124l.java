package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* JADX INFO: renamed from: lُٕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11124l extends AbstractC11825l {
    public final int billing;
    public final int mopub;
    public final int purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11124l(C15421l c15421l, C6743l c6743l) {
        String str;
        String str2 = c15421l.yandex() ? AbstractC6123l.amazon : AbstractC6123l.crashlytics;
        try {
            switch (c6743l.yandex) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.purchase = -1;
            this.billing = -1;
            this.mopub = -1;
            yandex();
            int i = this.yandex;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.purchase = iGlGetUniformLocation;
            AbstractC6123l.purchase(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.mopub = iGlGetAttribLocation;
            AbstractC6123l.purchase(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.billing = iGlGetUniformLocation2;
            AbstractC6123l.purchase(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC11825l
    public final void loadAd() {
        super.loadAd();
        GLES20.glUniform1i(this.purchase, 0);
        GLES20.glEnableVertexAttribArray(this.mopub);
        AbstractC6123l.loadAd("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.mopub, 2, 5126, false, 0, (Buffer) AbstractC6123l.subs);
        AbstractC6123l.loadAd("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11124l(C15421l c15421l, EnumC15109l enumC15109l) {
        C6743l c6743l;
        if (c15421l.yandex()) {
            AbstractC5641l.loadAd(enumC15109l != EnumC15109l.f29641l, "No default sampler shader available for" + enumC15109l);
            if (enumC15109l == EnumC15109l.f29639l) {
                c6743l = AbstractC6123l.mopub;
            } else {
                c6743l = AbstractC6123l.billing;
            }
        } else {
            c6743l = AbstractC6123l.purchase;
        }
        this(c15421l, c6743l);
    }
}
