package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: renamed from: lٖٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16407l extends C9064l {
    @Override // defpackage.C9064l
    public final Font smaato(C5882l c5882l) {
        Font fontAmazon;
        Uri uri = c5882l.yandex;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c5882l.purchase;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontAmazon = AbstractC7618l.amazon(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontAmazon;
                }
                try {
                    return new Font.Builder(fontAmazon).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
