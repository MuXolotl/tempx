package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: renamed from: lِّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11825l {
    public final int yandex;
    public int loadAd = -1;
    public int crashlytics = -1;
    public int amazon = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public AbstractC11825l(String str, String str2) throws Throwable {
        int iFirebase;
        int iFirebase2;
        int iGlCreateProgram;
        try {
            iFirebase = AbstractC6123l.firebase(35633, str);
            try {
                iFirebase2 = AbstractC6123l.firebase(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        AbstractC6123l.loadAd("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iFirebase);
                        AbstractC6123l.loadAd("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iFirebase2);
                        AbstractC6123l.loadAd("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.yandex = iGlCreateProgram;
                            yandex();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (iFirebase != -1) {
                            GLES20.glDeleteShader(iFirebase);
                        }
                        if (iFirebase2 != -1) {
                            GLES20.glDeleteShader(iFirebase2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (iFirebase != -1) {
                            GLES20.glDeleteShader(iFirebase);
                        }
                        if (iFirebase2 != -1) {
                            GLES20.glDeleteShader(iFirebase2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                iFirebase2 = -1;
                iGlCreateProgram = iFirebase2;
                if (iFirebase != -1) {
                    GLES20.glDeleteShader(iFirebase);
                }
                if (iFirebase2 != -1) {
                    GLES20.glDeleteShader(iFirebase2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            iFirebase = -1;
            iFirebase2 = -1;
        }
    }

    public void loadAd() {
        GLES20.glUseProgram(this.yandex);
        AbstractC6123l.loadAd("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.amazon);
        AbstractC6123l.loadAd("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.amazon, 2, 5126, false, 0, (Buffer) AbstractC6123l.admob);
        AbstractC6123l.loadAd("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.loadAd, 1, false, fArr, 0);
        AbstractC6123l.loadAd("glUniformMatrix4fv");
        GLES20.glUniform1f(this.crashlytics, 1.0f);
        AbstractC6123l.loadAd("glUniform1f");
    }

    public final void yandex() {
        int i = this.yandex;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.amazon = iGlGetAttribLocation;
        AbstractC6123l.purchase(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.loadAd = iGlGetUniformLocation;
        AbstractC6123l.purchase(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.crashlytics = iGlGetUniformLocation2;
        AbstractC6123l.purchase(iGlGetUniformLocation2, "uAlphaScale");
    }
}
