package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lُِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10987l extends AbstractC12586l {

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public InterfaceC13490l f22133l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public InterfaceC14745l f22134l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C15389l f22135l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public InterfaceC14745l f22136l;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public static final Object m3026l(C10987l c10987l, float f, AbstractC0283l abstractC0283l) {
        C18065l c18065l;
        C13250l c13250l;
        if (abstractC0283l instanceof C18065l) {
            c18065l = (C18065l) abstractC0283l;
            int i = c18065l.f35358l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18065l.f35358l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18065l = new C18065l(c10987l, abstractC0283l);
            }
        } else {
            c18065l = new C18065l(c10987l, abstractC0283l);
        }
        Object obj = c18065l.f35359l;
        int i2 = c18065l.f35358l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10987l.f22135l.getClass();
            C13250l c13250l2 = new C13250l();
            c13250l2.f26029l = f;
            C15389l c15389l = c10987l.f22135l;
            C2718l c2718l = new C2718l(c10987l, c13250l2, f, null);
            c18065l.f35360l = c13250l2;
            c18065l.f35358l = 2;
            Object objLoadAd = C15389l.loadAd(c15389l, c2718l, c18065l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
            c13250l = c13250l2;
        } else {
            if (i2 == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13250l = c18065l.f35360l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Float(c13250l.f26029l);
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final void m3027l(InterfaceC14745l interfaceC14745l) {
        if (interfaceC14745l == null) {
            C4776l c4776l = AbstractC2124l.yandex;
            C13206l c13206l = AbstractC2124l.loadAd;
            InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            this.f22133l = interfaceC13490l;
            interfaceC14745l = new C16290l(new C0554l(this.f22135l, c13206l, new C4168l(interfaceC13490l, 0)), AbstractC12019l.loadAd, c4776l);
        }
        this.f22134l = interfaceC14745l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m3027l(this.f22136l);
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lؙؗٗ */
    public final boolean mo828l() {
        return ((C10086l) this.f22135l.purchase).getValue() != null;
    }

    @Override // defpackage.AbstractC12586l, defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
        if (this.f29462l) {
            InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            InterfaceC13490l interfaceC13490l2 = this.f22133l;
            if (interfaceC13490l2 == null || !interfaceC13490l2.equals(interfaceC13490l)) {
                this.f22133l = interfaceC13490l;
                m3027l(this.f22136l);
            }
        }
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lُٔۨ */
    public final void mo830l(C5685l c5685l) {
        if (this.f29462l) {
            AbstractC10999l.mopub(m3914l(), null, 0, new C12086l(this, c5685l, null, 5), 3);
        }
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lٖۡٓ */
    public final Object mo831l(C2375l c2375l, C2375l c2375l2) {
        Object objLoadAd = C15389l.loadAd(this.f22135l, new C14082l(c2375l, this, (InterfaceC14029l) null), c2375l2);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final void mo829l(long j) {
    }
}
