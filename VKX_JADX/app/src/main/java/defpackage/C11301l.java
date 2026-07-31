package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُۚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11301l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Context f22782l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f22783l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f22784l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f22785l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Collection f22786l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C13626l f22787l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f22788l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Iterator f22789l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ List f22790l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11301l(List list, C13626l c13626l, Context context, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22790l = list;
        this.f22787l = c13626l;
        this.f22782l = context;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:14:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f22785l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1c
            int r1 = r0.f22788l
            int r4 = r0.f22784l
            java.lang.Object r5 = r0.f22783l
            java.util.Iterator r6 = r0.f22789l
            java.util.Collection r7 = r0.f22786l
            java.util.Collection r7 = (java.util.Collection) r7
            defpackage.AbstractC2829l.crashlytics(r24)
            r8 = r24
            goto L5f
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            r0 = 0
            return r0
        L23:
            defpackage.AbstractC2829l.crashlytics(r24)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r4 = r0.f22790l
            java.util.Iterator r4 = r4.iterator()
            r7 = r1
            r1 = r3
            r6 = r4
            r4 = r1
        L35:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r6.next()
            r8 = r5
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r8 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r8
            lًؚٕ r9 = defpackage.C7268l.f15111l
            r10 = r7
            java.util.Collection r10 = (java.util.Collection) r10
            r0.f22786l = r10
            r0.f22789l = r6
            r0.f22783l = r5
            r0.f22784l = r4
            r0.f22788l = r1
            r0.f22785l = r2
            r9.getClass()
            java.lang.Object r8 = defpackage.C7268l.crashlytics(r8, r0)
            lٍؗؐ r9 = defpackage.EnumC9342l.f19165l
            if (r8 != r9) goto L5f
            return r9
        L5f:
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L35
            r7.add(r5)
            goto L35
        L6f:
            java.util.List r7 = (java.util.List) r7
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto Lc4
            lؙٜٖ r1 = new lؙٜٖ
            lؘُٛ r13 = new lؘُٛ
            lٔ٘۠ r14 = new lٔ٘۠
            r21 = 0
            r22 = 1
            r15 = 2
            lْۙ۠ r4 = r0.f22787l
            java.lang.Class<lْۙ۠> r17 = defpackage.C13626l.class
            java.lang.String r18 = "resolve"
            java.lang.String r19 = "resolve(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r20 = 0
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 8
            r5 = 2131231046(0x7f080146, float:1.8078162E38)
            r6 = 2131887763(0x7f120693, float:1.9410142E38)
            r13.<init>(r14, r5, r6, r4)
            int r4 = r7.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r5
            android.content.Context r0 = r0.f22782l
            r3 = 2131887767(0x7f120697, float:1.941015E38)
            java.lang.String r12 = r0.getString(r3, r2)
            lّؓٝ r8 = new lّؓٝ
            r9 = 2131887762(0x7f120692, float:1.941014E38)
            r10 = 2131887764(0x7f120694, float:1.9410144E38)
            r11 = 2131231053(0x7f08014d, float:1.8078176E38)
            r8.<init>(r9, r10, r11, r12, r13)
            r1.<init>(r8)
            return r1
        Lc4:
            lُؔٔ r0 = defpackage.C2614l.yandex
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11301l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C11301l(this.f22790l, this.f22787l, this.f22782l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11301l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
