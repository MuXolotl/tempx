package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒۙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1304l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f3380l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f3381l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13490l f3382l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C4910l f3383l = new C4910l(false);

    public C1304l(InterfaceC13490l interfaceC13490l) {
        this.f3382l = interfaceC13490l;
    }

    public final void amazon() {
        this.f3381l = true;
        C4910l c4910l = this.f3383l;
        if (c4910l.purchase()) {
            c4910l.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object billing(AbstractC0283l abstractC0283l) {
        C0830l c0830l;
        if (abstractC0283l instanceof C0830l) {
            c0830l = (C0830l) abstractC0283l;
            int i = c0830l.f2474l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0830l.f2474l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0830l = new C0830l(this, abstractC0283l);
            }
        } else {
            c0830l = new C0830l(this, abstractC0283l);
        }
        Object obj = c0830l.f2473l;
        int i2 = c0830l.f2474l;
        C4910l c4910l = this.f3383l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!this.f3381l && !this.f3380l) {
                c0830l.f2474l = 1;
                Object objYandex = c4910l.yandex(c0830l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Boolean.valueOf(this.f3381l);
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        c4910l.billing(null);
        return Boolean.valueOf(this.f3381l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final long mo866case(float f) {
        return this.f3382l.mo866case(f);
    }

    public final void crashlytics() {
        this.f3380l = true;
        C4910l c4910l = this.f3383l;
        if (c4910l.purchase()) {
            c4910l.billing(null);
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final float mo867final(float f) {
        return this.f3382l.mo867final(f);
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        return this.f3382l.inmobi(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final float mo868instanceof(float f) {
        return this.f3382l.mo868instanceof(f);
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        return this.f3382l.license(j);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f3382l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final long mo869l(long j) {
        return this.f3382l.mo869l(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final int mo870l(float f) {
        return this.f3382l.mo870l(f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final float mo871l(long j) {
        return this.f3382l.mo871l(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(AbstractC0283l abstractC0283l) {
        C0211l c0211l;
        if (abstractC0283l instanceof C0211l) {
            c0211l = (C0211l) abstractC0283l;
            int i = c0211l.f1182l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0211l.f1182l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0211l = new C0211l(this, abstractC0283l);
            }
        } else {
            c0211l = new C0211l(this, abstractC0283l);
        }
        Object obj = c0211l.f1181l;
        int i2 = c0211l.f1182l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c0211l.f1182l = 1;
            Object objYandex = this.f3383l.yandex(c0211l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        this.f3381l = false;
        this.f3380l = false;
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final float mo872static(int i) {
        return this.f3382l.mo872static(i);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final float mo873super() {
        return this.f3382l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final int mo874transient(long j) {
        return this.f3382l.mo874transient(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C3043l c3043l;
        if (abstractC0283l instanceof C3043l) {
            c3043l = (C3043l) abstractC0283l;
            int i = c3043l.f6564l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3043l.f6564l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3043l = new C3043l(this, abstractC0283l);
            }
        } else {
            c3043l = new C3043l(this, abstractC0283l);
        }
        Object objBilling = c3043l.f6563l;
        int i2 = c3043l.f6564l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            c3043l.f6564l = 1;
            objBilling = billing(c3043l);
            Object obj = EnumC9342l.f19165l;
            if (objBilling == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        if (((Boolean) objBilling).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new C10528l("The press gesture was canceled.");
    }
}
