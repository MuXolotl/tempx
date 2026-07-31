package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: lٗٗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17185l {
    public static final C15578l yandex = new C15578l(-39202156, false, new C12496l(9));
    public static final C15578l loadAd = new C15578l(1582488484, false, new C12496l(10));
    public static final C15578l crashlytics = new C15578l(414328099, false, new C12496l(11));
    public static final C15578l amazon = new C15578l(-1514016380, false, new C12496l(12));

    public static final Paint amazon(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        float fAmazon = (float) AbstractC3105l.amazon(bitmap.getWidth(), bitmap.getHeight(), i, i2, 1, C9192l.crashlytics);
        matrix.setTranslate((i - (bitmap.getWidth() * fAmazon)) / 2.0f, (i2 - (bitmap.getHeight() * fAmazon)) / 2.0f);
        matrix.preScale(fAmazon, fAmazon);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }

    public static byte[] billing(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        C8339l.metrica("n must not be negative");
        return null;
    }

    public static final boolean crashlytics(AbstractC13264l abstractC13264l, float f) {
        abstractC13264l.firebase().getClass();
        return !(((abstractC13264l.adcel() ? -f : yandex(abstractC13264l)) > 0.0f ? 1 : ((abstractC13264l.adcel() ? -f : yandex(abstractC13264l)) == 0.0f ? 0 : -1)) > 0);
    }

    public static BigInteger loadAd(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] mopub(int i, BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            C8339l.metrica("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            C18262l.ads("integer too large");
            return null;
        }
        if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        C18262l.ads("integer too large");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void purchase(C15578l c15578l, AbstractC0283l abstractC0283l) {
        C14746l c14746l;
        if (abstractC0283l instanceof C14746l) {
            c14746l = (C14746l) abstractC0283l;
            int i = c14746l.f28818l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14746l.f28818l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14746l = new C14746l(abstractC0283l);
            }
        } else {
            c14746l = new C14746l(abstractC0283l);
        }
        Object obj = c14746l.f28819l;
        int i2 = c14746l.f28818l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                AbstractC2829l.crashlytics(obj);
                C17132l.firebase();
                return;
            }
        }
        AbstractC2829l.crashlytics(obj);
        C2457l c2457l = (C2457l) c14746l.f1295l.mo245l(C15718l.f30875l);
        if (c2457l == null) {
            C8339l.smaato("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        } else {
            c14746l.f28818l = 1;
            c2457l.yandex(c15578l, c14746l);
        }
    }

    public static final float yandex(AbstractC13264l abstractC13264l) {
        return abstractC13264l.firebase().purchase == EnumC7283l.f15125l ? Float.intBitsToFloat((int) (abstractC13264l.startapp() >> 32)) : Float.intBitsToFloat((int) (abstractC13264l.startapp() & 4294967295L));
    }
}
