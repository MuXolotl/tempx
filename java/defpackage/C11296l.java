package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lُۙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11296l extends AbstractC10170l implements InterfaceC8371l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final InterfaceC3841l f22751l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final AbstractC5662l f22752l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC5706l f22753l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C15627l f22754l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C9004l f22755l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C3624l f22756l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C12014l f22757l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C2278l f22758l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC8371l f22759l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C6561l f22760l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2252l f22761l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C6582l f22762l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C7644l f22763l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f22764l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC12974l f22765l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f22766l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C5509l f22767l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C9004l f22768l;

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    public C11296l(C7644l c7644l, C6582l c6582l, InterfaceC3588l interfaceC3588l, AbstractC12974l abstractC12974l, InterfaceC5706l interfaceC5706l) {
        int i;
        C6561l c6561l;
        int i2;
        AbstractC5662l c9927l;
        super((C16412l) ((C0511l) c7644l.f15738l).yandex, AbstractC18719l.subs(interfaceC3588l, c6582l.f13788l).billing());
        this.f22762l = c6582l;
        this.f22765l = abstractC12974l;
        this.f22753l = interfaceC5706l;
        this.f22756l = AbstractC18719l.subs(interfaceC3588l, c6582l.f13788l);
        EnumC4183l enumC4183l = (EnumC4183l) AbstractC1305l.purchase.purchase(c6582l.f13789l);
        int i3 = enumC4183l == null ? -1 : AbstractC4029l.yandex[enumC4183l.ordinal()];
        int i4 = 3;
        if (i3 == 1) {
            i = 1;
        } else if (i3 == 2) {
            i = 3;
        } else if (i3 == 3) {
            i = 4;
        } else if (i3 != 4) {
            i = 1;
        } else {
            i = 2;
        }
        this.f22764l = i;
        EnumC3338l enumC3338l = (EnumC3338l) AbstractC1305l.amazon.purchase(c6582l.f13789l);
        switch (enumC3338l == null ? -1 : AbstractC1603l.loadAd[enumC3338l.ordinal()]) {
            case 1:
                c6561l = AbstractC6004l.amazon;
                break;
            case 2:
                c6561l = AbstractC6004l.yandex;
                break;
            case 3:
                c6561l = AbstractC6004l.loadAd;
                break;
            case 4:
                c6561l = AbstractC6004l.crashlytics;
                break;
            case 5:
                c6561l = AbstractC6004l.purchase;
                break;
            case 6:
                c6561l = AbstractC6004l.billing;
                break;
            default:
                c6561l = AbstractC6004l.yandex;
                break;
        }
        this.f22760l = c6561l;
        EnumC16667l enumC16667l = (EnumC16667l) AbstractC1305l.billing.purchase(c6582l.f13789l);
        switch (enumC16667l != null ? AbstractC4029l.loadAd[enumC16667l.ordinal()] : -1) {
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
            case 7:
                i2 = 6;
                break;
            default:
                i2 = 1;
                break;
        }
        this.f22766l = i2;
        List list = c6582l.f13774l;
        C14965l c14965l = new C14965l(c6582l.f13770l);
        C5557l c5557l = C5557l.loadAd;
        C7644l c7644lLoadAd = c7644l.loadAd(this, list, interfaceC3588l, c14965l, AbstractC5712l.loadAd(c6582l.f13790l), abstractC12974l);
        C0511l c0511l = (C0511l) c7644lLoadAd.f15738l;
        C16412l c16412l = (C16412l) c0511l.yandex;
        this.f22763l = c7644lLoadAd;
        boolean zBooleanValue = AbstractC1305l.remoteconfig.purchase(c6582l.f13789l).booleanValue();
        int i5 = 0;
        if (i2 == 3) {
            c9927l = new C9927l(c16412l, this, zBooleanValue || AbstractC8576l.yandex(((InterfaceC17806l) c0511l.ads).mo3763try(), Boolean.TRUE));
        } else {
            c9927l = C3198l.loadAd;
        }
        this.f22752l = c9927l;
        this.f22767l = new C5509l(this);
        C6565l c6565l = C2252l.amazon;
        ((C5215l) ((InterfaceC11175l) c0511l.startapp)).getClass();
        int i6 = i2;
        C17847l c17847l = new C17847l(1, this, C15859l.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 0, 13);
        c6565l.getClass();
        this.f22761l = new C2252l(this, c16412l, c17847l);
        this.f22757l = i6 == 3 ? new C12014l(this) : null;
        InterfaceC8371l interfaceC8371l = (InterfaceC8371l) c7644l.f15734l;
        this.f22759l = interfaceC8371l;
        this.f22768l = new C9004l(c16412l, new C6014l(this, i5));
        this.f22758l = new C2278l(c16412l, new C6014l(this, 1));
        new C9004l(c16412l, new C6014l(this, 2));
        c16412l.yandex(new C6014l(this, i4));
        this.f22755l = new C9004l(c16412l, new C6014l(this, 4));
        InterfaceC3588l interfaceC3588l2 = (InterfaceC3588l) c7644lLoadAd.f15737l;
        C14965l c14965l2 = (C14965l) c7644lLoadAd.f15740l;
        C11296l c11296l = interfaceC8371l instanceof C11296l ? (C11296l) interfaceC8371l : null;
        this.f22754l = new C15627l(c6582l, interfaceC3588l2, c14965l2, interfaceC5706l, c11296l != null ? c11296l.f22754l : null);
        this.f22751l = !AbstractC1305l.crashlytics.purchase(c6582l.f13789l).booleanValue() ? C2782l.f6058l : new C3613l(c16412l, new C6014l(this, 5));
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return this.f22759l;
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        return (Collection) this.f22758l.invoke();
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        return this.f22760l;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return AbstractC1305l.firebase.purchase(this.f22762l.f13789l).booleanValue() && this.f22765l.yandex(1, 4, 2);
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return this.f22753l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return AbstractC1305l.isPro.purchase(this.f22762l.f13789l).booleanValue();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final C5786l mo751final() {
        return (C5786l) this.f22768l.invoke();
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return this.f22751l;
    }

    public final C15859l inmobi() {
        ((C5215l) ((InterfaceC11175l) ((C0511l) this.f22763l.f15738l).startapp)).getClass();
        C2252l c2252l = this.f22761l;
        AbstractC10170l abstractC10170l = c2252l.yandex;
        int i = AbstractC3759l.yandex;
        AbstractC11125l.crashlytics(abstractC10170l);
        C2278l c2278l = c2252l.crashlytics;
        InterfaceC13922l interfaceC13922l = C2252l.purchase[0];
        return (C15859l) ((InterfaceC7637l) c2278l.invoke());
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        return ((C15615l) this.f22763l.f15736l).vip();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        return this.f22766l;
    }

    @Override // defpackage.AbstractC10170l, defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final List mo2891l() {
        C7644l c7644l = this.f22763l;
        List listYandex = AbstractC7310l.yandex(this.f22762l, (C14965l) c7644l.f15740l);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7073l(mo2892l(), new C6653l(this, ((C15615l) c7644l.f15736l).premium((C18128l) it.next()), null, 0), C2782l.f6058l));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ */
    public final AbstractC5645l mo753l() {
        return (AbstractC5645l) this.f22755l.invoke();
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo755l() {
        return AbstractC1305l.admob.purchase(this.f22762l.f13789l).booleanValue();
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        return this.f22767l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final InterfaceC7637l mo756new() {
        return this.f22752l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final AbstractC15211l m3056package(C3498l c3498l) {
        Iterator it = inmobi().billing(c3498l, EnumC11300l.f22774l).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            InterfaceC10696l interfaceC10696l = (InterfaceC10696l) next;
            if (interfaceC10696l.mo1479return() == null && interfaceC10696l.mo1478l().isEmpty()) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        InterfaceC10696l interfaceC10696l2 = (InterfaceC10696l) obj;
        return (AbstractC15211l) (interfaceC10696l2 != null ? interfaceC10696l2.yandex() : null);
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        C2252l c2252l = this.f22761l;
        AbstractC10170l abstractC10170l = c2252l.yandex;
        int i = AbstractC3759l.yandex;
        AbstractC11125l.crashlytics(abstractC10170l);
        C2278l c2278l = c2252l.crashlytics;
        InterfaceC13922l interfaceC13922l = C2252l.purchase[0];
        return (InterfaceC7637l) c2278l.invoke();
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        if (!AbstractC1305l.firebase.purchase(this.f22762l.f13789l).booleanValue()) {
            return false;
        }
        AbstractC12974l abstractC12974l = this.f22765l;
        int i = abstractC12974l.loadAd;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC12974l.crashlytics;
            if (i2 >= 4 && (i2 > 4 || abstractC12974l.amazon > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        return this.f22764l;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return AbstractC1305l.mopub.purchase(this.f22762l.f13789l).booleanValue();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return AbstractC1305l.billing.purchase(this.f22762l.f13789l) == EnumC16667l.COMPANION_OBJECT;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo750case() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // defpackage.InterfaceC5436l
    public final boolean vip() {
        return AbstractC1305l.subs.purchase(this.f22762l.f13789l).booleanValue();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return AbstractC1305l.smaato.purchase(this.f22762l.f13789l).booleanValue();
    }
}
