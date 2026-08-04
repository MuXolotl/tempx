package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8539l extends AbstractC12074l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4594l f17625l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f17626l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f17627l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC14029l[] f17628l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f17629l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17630l;

    public C8539l(Object obj, Object obj2, List list) {
        super(obj2);
        this.f17627l = list;
        this.f17625l = new C4594l(this);
        this.f17629l = obj;
        this.f17628l = new InterfaceC14029l[list.size()];
        this.f17630l = -1;
    }

    public final boolean admob(boolean z) {
        Function3 function3;
        Object obj;
        C4594l c4594l;
        do {
            int i = this.f17626l;
            List list = this.f17627l;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                subs(this.f17629l);
                return false;
            }
            this.f17626l = i + 1;
            function3 = (Function3) list.get(i);
            try {
                obj = this.f17629l;
                c4594l = this.f17625l;
                AbstractC9464l.purchase(3, function3);
            } catch (Throwable th) {
                subs(new C18435l(th));
                return false;
            }
        } while (function3.invoke(this, obj, c4594l) != EnumC9342l.f19165l);
        return false;
    }

    @Override // defpackage.AbstractC12074l
    public final Object amazon(InterfaceC14029l interfaceC14029l) {
        if (this.f17626l == this.f17627l.size()) {
            return this.f17629l;
        }
        int i = this.f17630l + 1;
        this.f17630l = i;
        InterfaceC14029l[] interfaceC14029lArr = this.f17628l;
        interfaceC14029lArr[i] = interfaceC14029l;
        if (!admob(true)) {
            return EnumC9342l.f19165l;
        }
        int i2 = this.f17630l;
        if (i2 < 0) {
            C8339l.smaato("No more continuations to resume");
            return null;
        }
        this.f17630l = i2 - 1;
        interfaceC14029lArr[i2] = null;
        return this.f17629l;
    }

    @Override // defpackage.AbstractC12074l
    public final Object crashlytics() {
        return this.f17629l;
    }

    @Override // defpackage.AbstractC12074l
    public final void loadAd() {
        this.f17626l = this.f17627l.size();
    }

    @Override // defpackage.AbstractC12074l
    public final void mopub(Object obj) {
        this.f17629l = obj;
    }

    @Override // defpackage.AbstractC12074l
    public final Object purchase(InterfaceC14029l interfaceC14029l, Object obj) {
        this.f17629l = obj;
        return amazon(interfaceC14029l);
    }

    public final void subs(Object obj) {
        int i = this.f17630l;
        if (i < 0) {
            C8339l.smaato("No more continuations to resume");
            return;
        }
        InterfaceC14029l[] interfaceC14029lArr = this.f17628l;
        InterfaceC14029l interfaceC14029lBilling = interfaceC14029lArr[i];
        this.f17630l = i - 1;
        interfaceC14029lArr[i] = null;
        InterfaceC0273l interfaceC0273l = (InterfaceC0273l) interfaceC14029lBilling.metrica().mo245l(C6168l.f13001l);
        if (!(interfaceC0273l instanceof AbstractC1872l) || ((AbstractC1872l) interfaceC0273l).mo1065throw(interfaceC14029lBilling.metrica())) {
            interfaceC14029lBilling = AbstractC17082l.billing(interfaceC14029lBilling);
        }
        Throwable thYandex = C1171l.yandex(obj);
        if (thYandex == null) {
            interfaceC14029lBilling.subs(obj);
        } else {
            try {
                thYandex.getCause();
            } catch (Throwable unused) {
            }
            interfaceC14029lBilling.subs(new C18435l(thYandex));
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f17625l.metrica();
    }

    @Override // defpackage.AbstractC12074l
    public final Object yandex(Object obj, AbstractC0283l abstractC0283l) {
        this.f17626l = 0;
        if (this.f17627l.size() == 0) {
            return obj;
        }
        this.f17629l = obj;
        if (this.f17630l < 0) {
            return amazon(abstractC0283l);
        }
        C8339l.smaato("Already started");
        return null;
    }
}
