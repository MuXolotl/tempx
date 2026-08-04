package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌٕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8874l implements InterfaceC17865l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13645l f18239l = new C13645l(new C8163l(18), new C5266l(9), 13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC2449l f18240l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13660l f18241l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Map f18242l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16931l f18243l;

    public C8874l(Map map) {
        this.f18242l = map;
        long[] jArr = AbstractC12154l.yandex;
        this.f18241l = new C13660l();
        this.f18243l = new C16931l(14, this);
    }

    @Override // defpackage.InterfaceC17865l
    public final void loadAd(Object obj) {
        if (this.f18241l.smaato(obj) == null) {
            this.f18242l.remove(obj);
        }
    }

    @Override // defpackage.InterfaceC17865l
    public final void yandex(Object obj, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(533563200);
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
            c6956l.m2128goto(obj);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C16931l c16931l = this.f18243l;
                if (!((Boolean) c16931l.invoke(obj)).booleanValue()) {
                    C10754l.license(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.f18242l.get(obj);
                C10707l c10707l = AbstractC16780l.yandex;
                C16691l c16691l = new C16691l(new C0504l(map, c16931l));
                c6956l.m2147try(c16691l);
                objM2132native = c16691l;
            }
            C16691l c16691l2 = (C16691l) objM2132native;
            AbstractC10478l.loadAd(new C10092l[]{AbstractC16780l.yandex.yandex(c16691l2), AbstractC11677l.yandex.yandex(c16691l2)}, c15578l, c6956l, (i2 & 112) | 8);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this) | c6956l.admob(obj) | c6956l.admob(c16691l2);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C6411l(this, obj, c16691l2, 3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.loadAd(unit, (Function1) objM2132native2, c6956l);
            if (c6956l.advert && c6956l.f14600package.subs == c6956l.isVip) {
                c6956l.isVip = -1;
                c6956l.advert = false;
            }
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, obj, c15578l, i, 21);
        }
    }
}
