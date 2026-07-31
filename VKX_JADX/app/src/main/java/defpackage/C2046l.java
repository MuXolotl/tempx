package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؓۗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2046l extends AbstractC12074l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC12932l f4578l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f4579l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4580l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f4581l;

    public C2046l(Object obj, List list, Object obj2, InterfaceC12932l interfaceC12932l) {
        super(obj);
        this.f4579l = list;
        this.f4578l = interfaceC12932l;
        this.f4581l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object admob(InterfaceC14029l interfaceC14029l) {
        C1486l c1486l;
        Object objInvoke;
        EnumC9342l enumC9342l;
        if (interfaceC14029l instanceof C1486l) {
            c1486l = (C1486l) interfaceC14029l;
            int i = c1486l.f3704l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1486l.f3704l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1486l = new C1486l(this, interfaceC14029l);
            }
        } else {
            c1486l = new C1486l(this, interfaceC14029l);
        }
        Object obj = c1486l.f3703l;
        int i2 = c1486l.f3704l;
        if (i2 != 0 && i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        do {
            int i3 = this.f4580l;
            if (i3 != -1) {
                List list = this.f4579l;
                if (i3 >= list.size()) {
                    this.f4580l = -1;
                } else {
                    Function3 function3 = (Function3) list.get(i3);
                    this.f4580l = i3 + 1;
                    Object obj2 = this.f4581l;
                    c1486l.f3704l = 1;
                    objInvoke = function3.invoke(this, obj2, c1486l);
                    enumC9342l = EnumC9342l.f19165l;
                }
            }
            return this.f4581l;
        } while (objInvoke != enumC9342l);
        return enumC9342l;
    }

    @Override // defpackage.AbstractC12074l
    public final Object amazon(InterfaceC14029l interfaceC14029l) {
        int i = this.f4580l;
        if (i < 0) {
            return this.f4581l;
        }
        if (i < this.f4579l.size()) {
            return admob(interfaceC14029l);
        }
        this.f4580l = -1;
        return this.f4581l;
    }

    @Override // defpackage.AbstractC12074l
    public final Object crashlytics() {
        return this.f4581l;
    }

    @Override // defpackage.AbstractC12074l
    public final void loadAd() {
        this.f4580l = -1;
    }

    @Override // defpackage.AbstractC12074l
    public final void mopub(Object obj) {
        this.f4581l = obj;
    }

    @Override // defpackage.AbstractC12074l
    public final Object purchase(InterfaceC14029l interfaceC14029l, Object obj) {
        this.f4581l = obj;
        return amazon(interfaceC14029l);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f4578l;
    }

    @Override // defpackage.AbstractC12074l
    public final Object yandex(Object obj, AbstractC0283l abstractC0283l) {
        this.f4580l = 0;
        this.f4581l = obj;
        return amazon(abstractC0283l);
    }
}
