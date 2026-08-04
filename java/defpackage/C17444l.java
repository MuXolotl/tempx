package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٗ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17444l extends AbstractC16915l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f33989l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f33990l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17444l(Function1 function1, C18656l c18656l) {
        super(3);
        this.f33990l = function1;
        this.f33989l = c18656l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj;
        AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) obj2).adcel(((C15519l) obj3).yandex);
        if (interfaceC7448l.mo992import()) {
            if (((Boolean) this.f33990l.invoke(this.f33989l.amazon.getValue())).booleanValue()) {
                j = (((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
        }
        return interfaceC7448l.isVip((int) (j >> 32), (int) (4294967295L & j), C14054l.f27396l, new C16441l(abstractC10113lAdcel, 2));
    }
}
