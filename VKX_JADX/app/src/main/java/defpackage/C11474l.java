package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lُۥِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11474l extends C13637l {
    public final boolean smaato;

    public C11474l(String str, InterfaceC13593l interfaceC13593l) {
        super(str, interfaceC13593l, 1);
        this.smaato = true;
    }

    @Override // defpackage.C13637l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11474l) {
            InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
            if (this.yandex.equals(interfaceC18035l.yandex())) {
                C11474l c11474l = (C11474l) obj;
                if (c11474l.smaato && Arrays.equals((InterfaceC18035l[]) this.isPro.getValue(), (InterfaceC18035l[]) c11474l.isPro.getValue())) {
                    int iMopub = interfaceC18035l.mopub();
                    int i = this.crashlytics;
                    if (i == iMopub) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC8576l.yandex(isPro(i2).yandex(), interfaceC18035l.isPro(i2).yandex()) && AbstractC8576l.yandex(isPro(i2).billing(), interfaceC18035l.isPro(i2).billing())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.C13637l
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.C13637l, defpackage.InterfaceC18035l
    public final boolean purchase() {
        return this.smaato;
    }
}
