package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13941l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f27231l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f27232l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27233l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f27234l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13941l(C14451l c14451l, int i, AbstractC18643l abstractC18643l, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27233l = 5;
        this.f27232l = c14451l;
        this.f27235l = i;
        this.f27234l = abstractC18643l;
        this.f27231l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013e A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:56:0x011a, B:65:0x0138, B:67:0x013e, B:71:0x0144, B:73:0x0156, B:77:0x015c, B:84:0x0174, B:80:0x016d, B:87:0x0185, B:62:0x0130), top: B:105:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:56:0x011a, B:65:0x0138, B:67:0x013e, B:71:0x0144, B:73:0x0156, B:77:0x015c, B:84:0x0174, B:80:0x016d, B:87:0x0185, B:62:0x0130), top: B:105:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:80:0x016d A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:56:0x011a, B:65:0x0138, B:67:0x013e, B:71:0x0144, B:73:0x0156, B:77:0x015c, B:84:0x0174, B:80:0x016d, B:87:0x0185, B:62:0x0130), top: B:105:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0171  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x0184  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0182 -> B:57:0x011d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13941l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f27233l) {
            case 0:
                C13941l c13941l = new C13941l(2, interfaceC14029l);
                c13941l.f27234l = obj;
                return c13941l;
            case 1:
                return new C13941l((AbstractC12866l) this.f27232l, (Context) this.f27234l, this.f27231l, interfaceC14029l);
            case 2:
                C13941l c13941l2 = new C13941l((C5866l) this.f27232l, this.f27231l, interfaceC14029l);
                c13941l2.f27234l = obj;
                return c13941l2;
            case 3:
                return new C13941l((C16076l) this.f27232l, this.f27231l, (C10507l) this.f27234l, interfaceC14029l, 3);
            case 4:
                return new C13941l((C5616l) this.f27232l, this.f27231l, (C7234l) this.f27234l, interfaceC14029l, 4);
            default:
                return new C13941l((C14451l) this.f27232l, this.f27235l, (AbstractC18643l) this.f27234l, this.f27231l, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27233l) {
            case 0:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13941l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13941l(AbstractC12866l abstractC12866l, Context context, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27233l = 1;
        this.f27232l = abstractC12866l;
        this.f27234l = context;
        this.f27231l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13941l(C5866l c5866l, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27233l = 2;
        this.f27232l = c5866l;
        this.f27231l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13941l(int i, InterfaceC14029l interfaceC14029l) {
        super(i, interfaceC14029l);
        this.f27233l = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13941l(Object obj, int i, Object obj2, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f27233l = i2;
        this.f27232l = obj;
        this.f27231l = i;
        this.f27234l = obj2;
    }
}
