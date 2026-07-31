package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17657l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C1503l f34357l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f34358l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34359l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f34360l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f34361l;

    public /* synthetic */ C17657l(C1503l c1503l, C10700l c10700l, C10700l c10700l2, C10700l c10700l3) {
        this.f34357l = c1503l;
        this.f34358l = c10700l;
        this.f34361l = c10700l2;
        this.f34360l = c10700l3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.f34359l;
        C10700l c10700l = this.f34360l;
        C10700l c10700l2 = this.f34361l;
        C1503l c1503l = this.f34357l;
        C10700l c10700l3 = this.f34358l;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        C18262l.metrica("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    byte b = c1503l.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        C18262l.metrica("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z) {
                        c10700l3.f21708l = Integer.valueOf(c1503l.mo715l());
                    }
                    if (z2) {
                        c10700l2.f21708l = Integer.valueOf(c1503l.mo715l());
                    }
                    if (z3) {
                        c10700l.f21708l = Integer.valueOf(c1503l.mo715l());
                    }
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (c10700l3.f21708l != null) {
                        C18262l.metrica("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        return null;
                    }
                    if (jLongValue2 != 24) {
                        C18262l.metrica("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        return null;
                    }
                    c10700l3.f21708l = Long.valueOf(c1503l.mo711l());
                    c10700l2.f21708l = Long.valueOf(c1503l.mo711l());
                    c10700l.f21708l = Long.valueOf(c1503l.mo711l());
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17657l(C10700l c10700l, C1503l c1503l, C10700l c10700l2, C10700l c10700l3) {
        this.f34358l = c10700l;
        this.f34357l = c1503l;
        this.f34361l = c10700l2;
        this.f34360l = c10700l3;
    }
}
