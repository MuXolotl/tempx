package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11797l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ List f23609l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC14058l f23610l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f23611l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f23612l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f23613l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public /* synthetic */ Object f23614l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f23615l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Iterator f23616l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f23617l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f23618l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11797l(List list, ArrayList arrayList, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23609l = list;
        this.f23618l = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0092 -> B:23:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f23614l
            int r1 = r12.f23617l
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L34
            if (r1 == r4) goto L21
            if (r1 != r3) goto L1b
            int r0 = r12.f23615l
            java.util.Iterator r1 = r12.f23616l
            java.util.List r7 = r12.f23613l
            defpackage.AbstractC2829l.crashlytics(r13)
            goto L94
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r5
        L21:
            int r0 = r12.f23612l
            int r1 = r12.f23615l
            java.lang.Object r7 = r12.f23611l
            lَْٓ r8 = r12.f23610l
            java.util.Iterator r9 = r12.f23616l
            java.util.List r10 = r12.f23613l
            defpackage.AbstractC2829l.crashlytics(r13)
            r11 = r1
            r1 = r0
            r0 = r11
            goto L6b
        L34:
            defpackage.AbstractC2829l.crashlytics(r13)
            java.util.List r13 = r12.f23609l
            java.util.Iterator r13 = r13.iterator()
            java.util.ArrayList r1 = r12.f23618l
            r7 = r2
        L40:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r13.next()
            lَْٓ r8 = (defpackage.InterfaceC14058l) r8
            r12.f23614l = r5
            r12.f23613l = r1
            r12.f23616l = r13
            r12.f23610l = r8
            r12.f23611l = r0
            r12.f23615l = r7
            r12.f23612l = r2
            r12.f23617l = r4
            java.lang.Object r9 = r8.crashlytics(r12, r0)
            if (r9 != r6) goto L63
            goto L91
        L63:
            r10 = r9
            r9 = r13
            r13 = r10
            r10 = r7
            r7 = r0
            r0 = r10
            r10 = r1
            r1 = r2
        L6b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L9a
            lًٓؗ r13 = new lًٓؗ
            r13.<init>(r8, r5, r3)
            r10.add(r13)
            r12.f23614l = r5
            r12.f23613l = r10
            r12.f23616l = r9
            r12.f23610l = r5
            r12.f23611l = r5
            r12.f23615l = r0
            r12.f23612l = r1
            r12.f23617l = r3
            java.lang.Object r13 = r8.loadAd(r7, r12)
            if (r13 != r6) goto L92
        L91:
            return r6
        L92:
            r1 = r9
            r7 = r10
        L94:
            r11 = r0
            r0 = r13
            r13 = r1
            r1 = r7
            r7 = r11
            goto L40
        L9a:
            r13 = r7
            r7 = r0
            r0 = r13
            r13 = r9
            r1 = r10
            goto L40
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11797l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C11797l c11797l = new C11797l(this.f23609l, this.f23618l, interfaceC14029l);
        c11797l.f23614l = obj;
        return c11797l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11797l) ads((InterfaceC14029l) obj2, obj)).Signature(Unit.INSTANCE);
    }
}
