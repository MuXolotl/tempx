package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٟٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4296l extends C4146l {
    public final C0058l amazon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4296l() {
        super(4);
        C0058l c0058l = C0058l.f957l;
        this.amazon = c0058l;
    }

    public final C13949l admob() {
        C13949l c13949l;
        Object[] objArrCopyOf = this.yandex;
        int i = this.loadAd;
        C0058l c0058l = this.amazon;
        if (i == 0) {
            c13949l = C0058l.f957l != c0058l ? new C13949l(C13708l.f26763l, c0058l) : C13949l.f27246l;
        } else {
            AbstractC13743l.yandex(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, c0058l);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (c0058l.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            c13949l = new C13949l(AbstractC1186l.vip(i2, objArrCopyOf), c0058l);
        }
        this.loadAd = c13949l.f27247l.size();
        this.crashlytics = true;
        return c13949l;
    }

    @Override // defpackage.C4146l
    /* JADX INFO: renamed from: billing */
    public final C4146l yandex(Object obj) {
        super.yandex(obj);
        return this;
    }

    @Override // defpackage.C4146l
    public final /* bridge */ /* synthetic */ AbstractC8481l mopub() {
        throw null;
    }

    @Override // defpackage.C4146l, defpackage.AbstractC3594l
    public final AbstractC3594l yandex(Object obj) {
        super.yandex(obj);
        return this;
    }
}
