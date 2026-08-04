package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٌٌۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9153l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f18796l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18797l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C5835l f18798l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f18799l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f18800l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f18801l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9153l(int i, int i2, long j, InterfaceC14029l interfaceC14029l, C5835l c5835l) {
        super(2, interfaceC14029l);
        this.f18796l = j;
        this.f18797l = i;
        this.f18800l = i2;
        this.f18798l = c5835l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C9153l c9153l;
        InterfaceC16805l interfaceC16805l = (InterfaceC16805l) this.f18801l;
        int i = this.f18799l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C11485l c11485l = C11485l.f23075l;
            this.f18801l = interfaceC16805l;
            this.f18799l = 1;
            c9153l = this;
            obj = c11485l.isPro(this.f18796l, this.f18797l, this.f18800l, c9153l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            c9153l = this;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedPlaylist) it.next()).crashlytics());
        }
        AbstractC7188l abstractC7188l = c9153l.f18798l.crashlytics;
        abstractC7188l.getClass();
        abstractC7188l.billing(new C3631l(interfaceC16805l), arrayList);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C9153l c9153l = new C9153l(this.f18797l, this.f18800l, this.f18796l, interfaceC14029l, this.f18798l);
        c9153l.f18801l = obj;
        return c9153l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9153l) ads((InterfaceC14029l) obj2, (InterfaceC16805l) obj)).Signature(Unit.INSTANCE);
    }
}
