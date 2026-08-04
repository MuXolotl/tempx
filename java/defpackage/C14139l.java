package defpackage;

import j$.util.concurrent.ConcurrentMap$EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٓٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14139l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C11911l f27652l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Iterator f27653l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f27654l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ C6806l f27655l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C7171l f27656l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C7171l f27657l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f27658l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11911l f27659l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ List f27660l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14139l(List list, C7171l c7171l, C11911l c11911l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f27660l = list;
        this.f27657l = c7171l;
        this.f27652l = c11911l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Iterator it;
        int i;
        C11911l c11911l;
        C7171l c7171l;
        C6806l c6806l = this.f27655l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = this.f27658l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            List list = this.f27660l;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((Boolean) ((C5808l) obj2).loadAd.invoke(c6806l)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            C7171l c7171l2 = this.f27657l;
            C11911l c11911l2 = this.f27652l;
            it = arrayList.iterator();
            i = 0;
            c11911l = c11911l2;
            c7171l = c7171l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f27654l;
            it = this.f27653l;
            c11911l = this.f27659l;
            c7171l = this.f27656l;
            AbstractC2829l.crashlytics(obj);
        }
        while (it.hasNext()) {
            C5808l c5808l = (C5808l) it.next();
            InterfaceC6272l interfaceC6272l = AbstractC3180l.yandex;
            if (interfaceC6272l.admob()) {
                interfaceC6272l.vip("Adding auth headers for " + c6806l.yandex + " from provider " + c5808l);
            }
            ((Map) c6806l.billing.yandex(c11911l, new C8631l(22))).put(c5808l, new Integer(((C2309l) ConcurrentMap$EL.computeIfAbsent(c7171l.f15006l, c5808l, new C6654l(new C6199l(2, new C8631l(21))))).atomic));
            this.f27655l = c6806l;
            this.f27656l = c7171l;
            this.f27659l = c11911l;
            this.f27653l = it;
            this.f27654l = i;
            this.f27658l = 1;
            if (c5808l.yandex(c6806l, this) == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C7171l c7171l = this.f27657l;
        C11911l c11911l = this.f27652l;
        C14139l c14139l = new C14139l(this.f27660l, c7171l, c11911l, (InterfaceC14029l) obj4);
        c14139l.f27655l = (C6806l) obj2;
        return c14139l.Signature(Unit.INSTANCE);
    }
}
