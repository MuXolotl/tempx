package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2999l extends AbstractC15391l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10086l f6505l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f6506l;

    public C2999l(Context context) {
        super(context);
        this.f6505l = AbstractC8020l.smaato(AbstractC14024l.yandex);
    }

    @Override // defpackage.AbstractC15391l
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6506l;
    }

    @Override // defpackage.AbstractC15391l
    public final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(576708319);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.f6505l.getValue()).invoke(c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4951l(this, i, 8);
        }
    }
}
