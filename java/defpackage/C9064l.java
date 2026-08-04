package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: lٌٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9064l extends AbstractC2133l {
    public static Font isPro(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iRemoteconfig = remoteconfig(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iRemoteconfig2 = remoteconfig(fontStyle, font2.getStyle());
            if (iRemoteconfig2 < iRemoteconfig) {
                font = font2;
                iRemoteconfig = iRemoteconfig2;
            }
        }
        return font;
    }

    public static int remoteconfig(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface amazon(Context context, C5882l[] c5882lArr, int i) {
        try {
            FontFamily fontFamilyFirebase = firebase(c5882lArr, context.getContentResolver());
            if (fontFamilyFirebase == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyFirebase).setStyle(isPro(fontFamilyFirebase, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface billing(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface crashlytics(Context context, C16926l c16926l, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C11221l c11221l : c16926l.yandex) {
                try {
                    Font fontBuild = new Font.Builder(resources, c11221l.billing).setWeight(c11221l.loadAd).setSlant(c11221l.crashlytics ? 1 : 0).setTtcIndex(c11221l.purchase).setFontVariationSettings(c11221l.amazon).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(isPro(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily firebase(C5882l[] c5882lArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (C5882l c5882l : c5882lArr) {
            if (Objects.equals(c5882l.yandex.getScheme(), "systemfont")) {
                fontBuild = smaato(c5882l);
            } else {
                try {
                    Uri uri = c5882l.yandex;
                    String str = c5882l.purchase;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c5882l.crashlytics).setSlant(c5882l.amazon ? 1 : 0).setTtcIndex(c5882l.loadAd);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface purchase(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyFirebase = firebase((C5882l[]) list.get(0), contentResolver);
            if (fontFamilyFirebase == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyFirebase);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyFirebase2 = firebase((C5882l[]) list.get(i2), contentResolver);
                if (fontFamilyFirebase2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyFirebase2);
                }
            }
            return customFallbackBuilder.setStyle(isPro(fontFamilyFirebase, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Font smaato(C5882l c5882l) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
