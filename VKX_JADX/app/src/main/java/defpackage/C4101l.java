package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؖٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4101l extends AbstractC14971l implements InterfaceC7150l, InterfaceC16388l, InterfaceC3703l, InterfaceC13202l, InterfaceC18141l, InterfaceC2653l, InterfaceC15641l, InterfaceC3506l, InterfaceC10653l, InterfaceC3228l, InterfaceC12556l, InterfaceC0827l, InterfaceC18149l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public HashSet f8439l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC13112l f8440l;

    @Override // defpackage.InterfaceC0827l
    public final boolean ad() {
        return this.f29462l;
    }

    @Override // defpackage.InterfaceC18149l
    public final long admob() {
        return AbstractC14707l.mopub(AbstractC5573l.smaato(this, 128).f20590l);
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        return ((InterfaceC6263l) this.f8440l).amazon(interfaceC7448l, interfaceC6357l, j);
    }

    @Override // defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        C17219l c17219l = ((C13408l) this.f8440l).f26312l;
        C13408l c13408l = (C13408l) c17219l.f33426l;
        List list = c9185l.yandex;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            C15730l c15730l = (C15730l) list.get(i);
            if (AbstractC3474l.amazon(c15730l) || AbstractC3474l.billing(c15730l)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((C15730l) list.get(i2)).crashlytics()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (c13408l.f26309l) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                C15730l c15730l2 = (C15730l) list.get(i3);
                if (!AbstractC3474l.amazon(c15730l2) && !AbstractC3474l.billing(c15730l2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        int i4 = c17219l.f33424l;
        EnumC9065l enumC9065l2 = EnumC9065l.f18652l;
        if (i4 != 3) {
            if (enumC9065l == EnumC9065l.f18654l && z3) {
                c17219l.f33427l = c9185l;
                c17219l.pro(c9185l, !z || c13408l.f26309l);
            }
            if (enumC9065l == EnumC9065l.f18653l && z && c9185l == ((C9185l) c17219l.f33427l) && c13408l.f26309l) {
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((C15730l) list.get(i5)).yandex();
                }
            }
            if (enumC9065l == enumC9065l2 && !z3 && c9185l != ((C9185l) c17219l.f33427l)) {
                c17219l.pro(c9185l, true);
            }
        }
        if (enumC9065l == enumC9065l2) {
            int size5 = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    c17219l.f33424l = 1;
                    c13408l.f26309l = false;
                    c17219l.f33427l = null;
                    break;
                } else if (!AbstractC3474l.billing((C15730l) list.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            if (c9185l == ((C9185l) c17219l.f33427l) && z) {
                int size6 = list.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    if (((C15730l) list.get(i7)).crashlytics()) {
                        if (c13408l.f26309l) {
                            break;
                        }
                        c17219l.m4290static(c9185l);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    ((C15730l) list.get(i8)).yandex();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return ((InterfaceC6263l) this.f8440l).billing(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void mo1493class() {
        C17219l c17219l = ((C13408l) this.f8440l).f26312l;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final void mo533continue() {
        AbstractC2697l.firebase(this);
    }

    @Override // defpackage.InterfaceC2653l
    public final Object crashlytics(InterfaceC13490l interfaceC13490l, Object obj) {
        return ((InterfaceC11806l) this.f8440l).crashlytics(interfaceC13490l, obj);
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        ((AbstractC17450l) this.f8440l).mo2634for(interfaceC18212l);
    }

    @Override // defpackage.InterfaceC18149l
    public final EnumC9931l getLayoutDirection() {
        return AbstractC5573l.metrica(this).f7691l;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        C6264l c6264lMo1690l = ((InterfaceC5116l) this.f8440l).mo1690l();
        C6264l c6264l = (C6264l) interfaceC17593l;
        C13660l c13660l = c6264l.f13225l;
        if (c6264lMo1690l.f13223l) {
            c6264l.f13223l = true;
        }
        if (c6264lMo1690l.f13226l) {
            c6264l.f13226l = true;
        }
        C13660l c13660l2 = c6264lMo1690l.f13225l;
        Object[] objArr = c13660l2.loadAd;
        Object[] objArr2 = c13660l2.crashlytics;
        long[] jArr = c13660l2.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C4707l c4707l = (C4707l) obj;
                        if (!c13660l.loadAd(c4707l)) {
                            c13660l.vip(c4707l, obj2);
                        } else if (obj2 instanceof C7629l) {
                            C7629l c7629l = (C7629l) c13660l.mopub(c4707l);
                            String str = c7629l.yandex;
                            if (str == null) {
                                str = ((C7629l) obj2).yandex;
                            }
                            InterfaceC14328l interfaceC14328l = c7629l.loadAd;
                            if (interfaceC14328l == null) {
                                interfaceC14328l = ((C7629l) obj2).loadAd;
                            }
                            c13660l.vip(c4707l, new C7629l(str, interfaceC14328l));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC18149l
    public final InterfaceC13490l loadAd() {
        return AbstractC5573l.metrica(this).f7668l;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("unInitializeModifier called on unattached node");
        }
        if ((this.f29450l & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).signatures();
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m1494l(true);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m1494l(boolean z) {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("initializeModifier called on unattached node");
        }
        InterfaceC13112l interfaceC13112l = this.f8440l;
        if ((this.f29450l & 4) != 0 && !z) {
            AbstractC4047l.subs(this);
        }
        if ((this.f29450l & 2) != 0) {
            if (((C13924l) AbstractC5573l.metrica(this).f7703l.billing).f27212l) {
                AbstractC18026l abstractC18026l = this.f29452l;
                ((C9405l) abstractC18026l).m2642l(this);
                InterfaceC10702l interfaceC10702l = abstractC18026l.f35287l;
                if (interfaceC10702l != null) {
                    ((C6577l) interfaceC10702l).crashlytics();
                }
            }
            if (!z) {
                AbstractC4047l.subs(this);
                AbstractC5573l.metrica(this).m1395synchronized();
            }
        }
        if (interfaceC13112l instanceof C6188l) {
            C6188l c6188l = (C6188l) interfaceC13112l;
            C3654l c3654lMetrica = AbstractC5573l.metrica(this);
            switch (c6188l.f13054l) {
                case 0:
                    ((C8232l) c6188l.f13053l).isPro = c3654lMetrica;
                    break;
                case 1:
                    ((C5866l) c6188l.f13053l).smaato = c3654lMetrica;
                    break;
                case 2:
                    ((C7583l) c6188l.f13053l).admob = c3654lMetrica;
                    break;
                default:
                    ((AbstractC13264l) c6188l.f13053l).ad.setValue(c3654lMetrica);
                    break;
            }
        }
        if ((this.f29450l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (interfaceC13112l instanceof AbstractC17450l) && ((C13924l) AbstractC5573l.metrica(this).f7703l.billing).f27212l) {
            AbstractC5573l.metrica(this).m1395synchronized();
        }
        int i = this.f29450l;
        if ((i & 16) != 0 && (interfaceC13112l instanceof C13408l)) {
            ((C13408l) interfaceC13112l).f26312l.f33423l = this.f29452l;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).signatures();
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final void mo1495l() {
        if (this.f8440l instanceof C13408l) {
            mo1500throw();
        }
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        ((C11881l) this.f8440l).f23701l.getClass();
        c6742l.yandex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final Object mo1496l(C5138l c5138l) {
        C18289l c18289l;
        this.f8439l.add(c5138l);
        if (!this.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l = this.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(this);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 32) != 0) {
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 32) != 0) {
                        ?? LoadAd = abstractC14971l;
                        ?? c17893l = 0;
                        while (LoadAd != 0) {
                            if (LoadAd instanceof InterfaceC18141l) {
                                InterfaceC18141l interfaceC18141l = (InterfaceC18141l) LoadAd;
                                if (interfaceC18141l.mo1499new().crashlytics(c5138l)) {
                                    return interfaceC18141l.mo1499new().billing(c5138l);
                                }
                            } else if ((LoadAd.f29450l & 32) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                                int i = 0;
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                                while (abstractC14971l2 != null) {
                                    if ((abstractC14971l2.f29450l & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            c17893l = c17893l;
                                            LoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l == 0) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (LoadAd != 0) {
                                                c17893l.crashlytics(LoadAd);
                                                LoadAd = 0;
                                            }
                                            c17893l.crashlytics(abstractC14971l2);
                                        }
                                    }
                                    abstractC14971l2 = abstractC14971l2.f29460l;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                }
                                if (i == 1) {
                                }
                            }
                            LoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return ((Function0) c5138l.f11181l).invoke();
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final boolean mo1497l() {
        C17219l c17219l = ((C13408l) this.f8440l).f26312l;
        return true;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final void mo1498l() {
        mo1500throw();
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return ((InterfaceC6263l) this.f8440l).mopub(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC10653l
    /* JADX INFO: renamed from: native */
    public final void mo1231native(EnumC11822l enumC11822l) {
        InterfaceC13112l interfaceC13112l = this.f8440l;
        AbstractC0081l.crashlytics("onFocusEvent called on wrong node");
        interfaceC13112l.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final AbstractC17195l mo1499new() {
        return C4761l.loadAd;
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return ((InterfaceC6263l) this.f8440l).subs(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3228l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1299synchronized(InterfaceC1389l interfaceC1389l) {
        InterfaceC13112l interfaceC13112l = this.f8440l;
        AbstractC0081l.crashlytics("applyFocusProperties called on wrong node");
        interfaceC13112l.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        return AbstractC10549l.yandex;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void mo1500throw() {
        C17219l c17219l = ((C13408l) this.f8440l).f26312l;
        C13408l c13408l = (C13408l) c17219l.f33426l;
        if (c17219l.f33424l == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            C5205l c5205l = c13408l.f26311l;
            if (c5205l == null) {
                c5205l = null;
            }
            c5205l.invoke(motionEventObtain);
            Unit unit = Unit.INSTANCE;
            motionEventObtain.recycle();
            c17219l.f33424l = 1;
            c13408l.f26309l = false;
            c17219l.f33427l = null;
        }
    }

    public final String toString() {
        return this.f8440l.toString();
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return ((InterfaceC6263l) this.f8440l).yandex(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC4325l
    public final void Signature(long j) {
    }

    @Override // defpackage.InterfaceC15641l
    public final void startapp(InterfaceC18212l interfaceC18212l) {
    }
}
