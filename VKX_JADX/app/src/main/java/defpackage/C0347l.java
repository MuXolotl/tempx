package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lٕؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0347l extends AbstractC6968l {
    public final C9852l admob;
    public final C7972l subs;

    public C0347l(C9852l c9852l, C7972l c7972l) {
        this.admob = c9852l;
        this.subs = c7972l;
    }

    public static C0347l subs(C9852l c9852l, C7972l c7972l) throws GeneralSecurityException {
        if (c9852l.yandex == ((C0346l) c7972l.f16631l).yandex.length) {
            return new C0347l(c9852l, c7972l);
        }
        C18262l.ads("Key size mismatch");
        return null;
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return null;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }
}
