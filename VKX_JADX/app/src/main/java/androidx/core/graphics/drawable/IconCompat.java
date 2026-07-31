package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.AbstractC13950l;
import defpackage.AbstractC5121l;
import defpackage.AbstractC5941l;
import defpackage.C11983l;
import defpackage.C1759l;
import defpackage.C18262l;
import defpackage.C8339l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode firebase = PorterDuff.Mode.SRC_IN;
    public String isPro;
    public Object loadAd;
    public int yandex;
    public byte[] crashlytics = null;
    public Parcelable amazon = null;
    public int purchase = 0;
    public int billing = 0;
    public ColorStateList mopub = null;
    public PorterDuff.Mode admob = firebase;
    public String subs = null;

    public IconCompat(int i) {
        this.yandex = i;
    }

    public static IconCompat crashlytics(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            C8339l.metrica("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.purchase = i;
        if (resources != null) {
            try {
                iconCompat.loadAd = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                C8339l.metrica("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.loadAd = str;
        }
        iconCompat.isPro = str;
        return iconCompat;
    }

    public static Bitmap loadAd(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat yandex(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.purchase = bundle.getInt("int1");
        iconCompat.billing = bundle.getInt("int2");
        iconCompat.isPro = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.mopub = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.admob = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.loadAd = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.loadAd = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.loadAd = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public final Bundle admob() {
        Bundle bundle = new Bundle();
        switch (this.yandex) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.loadAd);
                break;
            case 0:
            default:
                C8339l.metrica("Invalid icon");
                return null;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.loadAd);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.loadAd);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.loadAd);
                break;
        }
        bundle.putInt("type", this.yandex);
        bundle.putInt("int1", this.purchase);
        bundle.putInt("int2", this.billing);
        bundle.putString("string1", this.isPro);
        ColorStateList colorStateList = this.mopub;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.admob;
        if (mode != firebase) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final int amazon() {
        int i = this.yandex;
        if (i != -1) {
            if (i == 2) {
                return this.purchase;
            }
            C11983l.ad(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.loadAd;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC13950l.signatures(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final int billing() {
        int i = this.yandex;
        if (i != -1) {
            return i;
        }
        Object obj = this.loadAd;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC13950l.m3830volatile(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    public final Uri mopub() {
        int i = this.yandex;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.loadAd);
            }
            C11983l.ad(this, "called getUri() on ");
            return null;
        }
        Object obj = this.loadAd;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC13950l.m3816native(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final String purchase() {
        int i = this.yandex;
        if (i != -1) {
            if (i == 2) {
                String str = this.isPro;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.loadAd).split(":", -1)[0] : this.isPro;
            }
            C11983l.ad(this, "called getResPackage() on ");
            return null;
        }
        Object obj = this.loadAd;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC13950l.premium(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    public final Icon subs(Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        switch (this.yandex) {
            case -1:
                return (Icon) this.loadAd;
            case 0:
            default:
                C8339l.metrica("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.loadAd);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(purchase(), this.purchase);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.loadAd, this.purchase, this.billing);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.loadAd);
                break;
            case 5:
                int i = Build.VERSION.SDK_INT;
                Object obj = this.loadAd;
                iconCreateWithBitmap = i < 26 ? Icon.createWithBitmap(loadAd((Bitmap) obj, false)) : AbstractC5941l.adcel((Bitmap) obj);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = AbstractC5121l.loadAd(mopub());
                } else {
                    if (context == null) {
                        C18262l.startapp(mopub(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriMopub = mopub();
                    String scheme = uriMopub.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriMopub);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriMopub, e);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.loadAd));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriMopub, e2);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        C1759l.isPro(mopub(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(loadAd(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = AbstractC5941l.adcel(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.mopub;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.admob;
        if (mode != firebase) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.yandex == -1) {
            return String.valueOf(this.loadAd);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.yandex) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.yandex) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.loadAd).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.loadAd).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.isPro);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(amazon())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.purchase);
                if (this.billing != 0) {
                    sb.append(" off=");
                    sb.append(this.billing);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.loadAd);
                break;
        }
        if (this.mopub != null) {
            sb.append(" tint=");
            sb.append(this.mopub);
        }
        if (this.admob != firebase) {
            sb.append(" mode=");
            sb.append(this.admob);
        }
        sb.append(")");
        return sb.toString();
    }
}
