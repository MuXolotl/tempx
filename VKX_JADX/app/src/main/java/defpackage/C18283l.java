package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* JADX INFO: renamed from: lؚ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18283l {
    public String amazon;
    public boolean billing;
    public String crashlytics;
    public IconCompat loadAd;
    public boolean purchase;
    public CharSequence yandex;

    public static C18283l yandex(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatYandex = bundle2 != null ? IconCompat.yandex(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        C18283l c18283l = new C18283l();
        c18283l.yandex = charSequence;
        c18283l.loadAd = iconCompatYandex;
        c18283l.crashlytics = string;
        c18283l.amazon = string2;
        c18283l.purchase = z;
        c18283l.billing = z2;
        return c18283l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C18283l)) {
            return false;
        }
        C18283l c18283l = (C18283l) obj;
        String str = this.amazon;
        String str2 = c18283l.amazon;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.yandex), Objects.toString(c18283l.yandex)) && Objects.equals(this.crashlytics, c18283l.crashlytics) && Boolean.valueOf(this.purchase).equals(Boolean.valueOf(c18283l.purchase)) && Boolean.valueOf(this.billing).equals(Boolean.valueOf(c18283l.billing));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.amazon;
        return str != null ? str.hashCode() : Objects.hash(this.yandex, this.crashlytics, Boolean.valueOf(this.purchase), Boolean.valueOf(this.billing));
    }
}
