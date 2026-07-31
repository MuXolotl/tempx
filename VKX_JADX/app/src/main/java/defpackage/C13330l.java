package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13330l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final Function2 f26167l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int f26168l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int f26169l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final Function0 f26170l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final int f26171l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final Function0 f26172l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public boolean f26173l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f26174l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final Function0 f26175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13330l(int i, int i2, int i3, C15578l c15578l, C8520l c8520l, Function0 function0, C8520l c8520l2, int i4) {
        super(false, 3);
        int i5 = (i4 & 8) != 0 ? R.string.cancel : R.string.libvkx_enable_warn_action;
        c15578l = (i4 & 32) != 0 ? AbstractC16291l.yandex : c15578l;
        Function0 c11200l = (i4 & 64) != 0 ? new C11200l(25) : c8520l;
        Function0 c11200l2 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new C11200l(26) : c8520l2;
        this.f26174l = i;
        this.f26171l = i2;
        this.f26169l = i5;
        this.f26168l = i3;
        this.f26167l = c15578l;
        this.f26175l = c11200l;
        this.f26170l = function0;
        this.f26172l = c11200l2;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-214283322);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(500181707, new C4035l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4035l(this, i);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        if (this.f26173l) {
            return;
        }
        this.f26172l.invoke();
    }
}
