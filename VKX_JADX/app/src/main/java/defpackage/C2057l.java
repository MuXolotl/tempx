package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2057l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f4591l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f4592l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f4593l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f4594l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2057l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f4591l = i;
        this.f4594l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1 A[LOOP:1: B:79:0x01ad->B:83:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:33:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0180 -> B:72:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2057l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f4591l;
        Object obj2 = this.f4594l;
        switch (i) {
            case 0:
                C2057l c2057l = new C2057l((C10306l) obj2, interfaceC14029l, 0);
                c2057l.f4592l = obj;
                return c2057l;
            case 1:
                C2057l c2057l2 = new C2057l((EnumC9065l) obj2, interfaceC14029l, 1);
                c2057l2.f4592l = obj;
                return c2057l2;
            case 2:
                C2057l c2057l3 = new C2057l((Function2) obj2, interfaceC14029l, 2);
                c2057l3.f4592l = obj;
                return c2057l3;
            case 3:
                C2057l c2057l4 = new C2057l((C12217l) obj2, interfaceC14029l, 3);
                c2057l4.f4592l = obj;
                return c2057l4;
            default:
                C2057l c2057l5 = new C2057l((View) obj2, interfaceC14029l, 4);
                c2057l5.f4592l = obj;
                return c2057l5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4591l) {
            case 0:
                return ((C2057l) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C2057l) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C2057l) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
            case 3:
                ((C2057l) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
            default:
                return ((C2057l) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
