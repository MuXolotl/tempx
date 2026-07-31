package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10641l implements InterfaceC2449l, InterfaceC17865l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C6295l f21595l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC17865l f21596l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0504l f21597l;

    public C10641l(InterfaceC2449l interfaceC2449l, Map map, InterfaceC17865l interfaceC17865l) {
        C17015l c17015l = new C17015l(22, interfaceC2449l);
        C10707l c10707l = AbstractC16780l.yandex;
        this.f21597l = new C0504l(map, c17015l);
        this.f21596l = interfaceC17865l;
        C6295l c6295l = AbstractC13087l.yandex;
        this.f21595l = new C6295l();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.InterfaceC2449l
    public final Map amazon() {
        C6295l c6295l = this.f21595l;
        Object[] objArr = c6295l.loadAd;
        long[] jArr = c6295l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f21596l.loadAd(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f21597l.amazon();
    }

    @Override // defpackage.InterfaceC2449l
    public final InterfaceC18327l billing(String str, Function0 function0) {
        return this.f21597l.billing(str, function0);
    }

    @Override // defpackage.InterfaceC2449l
    public final boolean crashlytics(Object obj) {
        return this.f21597l.crashlytics(obj);
    }

    @Override // defpackage.InterfaceC17865l
    public final void loadAd(Object obj) {
        this.f21596l.loadAd(obj);
    }

    @Override // defpackage.InterfaceC2449l
    public final Object purchase(String str) {
        return this.f21597l.purchase(str);
    }

    @Override // defpackage.InterfaceC17865l
    public final void yandex(Object obj, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-858296452);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            this.f21596l.yandex(obj, c15578l, c6956l, i2 & 126);
            boolean zAdmob = c6956l.admob(this) | c6956l.admob(obj);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C3005l(this, obj, 25);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.loadAd(obj, (Function1) objM2132native, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, obj, c15578l, i, 18);
        }
    }
}
