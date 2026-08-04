package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lٍؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9293l {
    public final Locale yandex;

    public C9293l(Locale locale) {
        this.yandex = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9293l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC8576l.yandex(this.yandex.toLanguageTag(), ((C9293l) obj).yandex.toLanguageTag());
    }

    public final int hashCode() {
        return this.yandex.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.yandex.toLanguageTag();
    }
}
