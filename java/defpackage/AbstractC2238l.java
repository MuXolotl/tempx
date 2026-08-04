package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؓۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2238l {
    public static Bitmap billing;
    public static final C18558l yandex = new C18558l(0.31006f, 0.31616f);
    public static final C18558l loadAd = new C18558l(0.34567f, 0.3585f);
    public static final C18558l crashlytics = new C18558l(0.32168f, 0.33767f);
    public static final C18558l amazon = new C18558l(0.31271f, 0.32902f);
    public static final float[] purchase = {0.964212f, 1.0f, 0.825188f};

    public static int admob(long j) {
        return (int) ((j - (((long) ((int) (58728449 * j))) * 8380417)) >>> 32);
    }

    public static final C4645l amazon(C7026l c7026l, long j) {
        C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
        Object obj = null;
        if (c6232lAdcel == null) {
            return null;
        }
        for (Object obj2 : c6232lAdcel.loadAd) {
            if (((C4645l) obj2).yandex == j) {
                obj = obj2;
                break;
            }
        }
        return (C4645l) obj;
    }

    public static /* synthetic */ void billing(AbstractC0576l abstractC0576l) {
        purchase(abstractC0576l, "object");
        throw null;
    }

    public static final String crashlytics(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC12024l.m3315catch(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC12024l.m3315catch(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final void isPro(C7026l c7026l, C4645l c4645l) {
        long j = c4645l.yandex;
        C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
        if (c6232lAdcel == null) {
            AbstractC7470l.ads(c7026l, new C6232l(j, Collections.singletonList(c4645l)));
            return;
        }
        List list = c6232lAdcel.loadAd;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4645l) obj).yandex != j) {
                arrayList.add(obj);
            }
        }
        AbstractC7470l.ads(c7026l, new C6232l(j, AbstractC16901l.m4218final(c4645l, arrayList)));
    }

    public static Bitmap loadAd(Activity activity) {
        try {
            InputStream inputStreamOpen = activity.getAssets().open("radial_gradient_dithered_circle_2048.gm");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
            if (bitmapDecodeStream == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
                Log.e("CircleDrawableCache", "made but null bitmap. please checking..");
                inputStreamOpen.close();
                return bitmapCreateBitmap;
            }
            int width = bitmapDecodeStream.getWidth() * bitmapDecodeStream.getHeight();
            int[] iArr = new int[width];
            bitmapDecodeStream.getPixels(iArr, 0, bitmapDecodeStream.getWidth(), 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
            for (int i = 0; i < width; i++) {
                iArr[i] = ((iArr[i] << 8) & (-16777216)) | 16777215;
            }
            bitmapDecodeStream.recycle();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap2.setPixels(iArr, 0, bitmapCreateBitmap2.getWidth(), 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap2, bitmapDecodeStream.getWidth() / 2, bitmapDecodeStream.getHeight() / 2, false);
            if (bitmapCreateScaledBitmap == null) {
                return bitmapCreateScaledBitmap;
            }
            inputStreamOpen.close();
            return bitmapCreateScaledBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final CharSequence mopub(CharSequence charSequence, int i) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbAd = AbstractC5020l.ad(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbAd.append(charSequence.subSequence(i2, i3).toString());
                sbAd.append(str2);
                return sbAd.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void purchase(AbstractC0576l abstractC0576l, String str) {
        abstractC0576l.subscription("Trailing comma before the end of JSON ".concat(str), abstractC0576l.f1972l - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final String subs(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC0653l.ads(sb, str != null ? AbstractC15560l.Signature(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final C16768l yandex(InterfaceC18035l interfaceC18035l) {
        String str = "Value of type '" + interfaceC18035l.yandex() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC18035l.billing() + '\'';
        interfaceC18035l.yandex();
        return new C16768l(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
