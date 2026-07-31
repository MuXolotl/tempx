package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: lِٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15621l implements InterfaceC17227l {
    public final LocaleList yandex;

    public C15621l(Object obj) {
        this.yandex = (LocaleList) obj;
    }

    public final boolean equals(Object obj) {
        return this.yandex.equals(((InterfaceC17227l) obj).loadAd());
    }

    @Override // defpackage.InterfaceC17227l
    public final Locale get(int i) {
        return this.yandex.get(i);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC17227l
    public final boolean isEmpty() {
        return this.yandex.isEmpty();
    }

    @Override // defpackage.InterfaceC17227l
    public final Object loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC17227l
    public final int size() {
        return this.yandex.size();
    }

    public final String toString() {
        return this.yandex.toString();
    }

    @Override // defpackage.InterfaceC17227l
    public final String yandex() {
        return this.yandex.toLanguageTags();
    }
}
