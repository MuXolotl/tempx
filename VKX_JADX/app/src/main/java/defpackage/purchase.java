package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class purchase extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f36552l = 0;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f36553l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f36554l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f36555l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f36556l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f36557l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f36558l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public purchase(InterfaceC14029l interfaceC14029l, InterfaceC2262l interfaceC2262l, C1304l c1304l, Function1 function1, Function3 function3) {
        super(2, interfaceC14029l);
        this.f36558l = interfaceC2262l;
        this.f36553l = c1304l;
        this.f36554l = function3;
        this.f36557l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C11129l c11129l;
        C11315l c11315l;
        Iterator it;
        int i = this.f36552l;
        Object obj2 = this.f36557l;
        Object obj3 = this.f36554l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC5921l abstractC5921l = (AbstractC5921l) obj2;
                C14025l c14025l = (C14025l) obj3;
                int i2 = this.f36556l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11129l c11129l2 = (C11129l) this.f36555l;
                    C11315l c11315l2 = new C11315l();
                    c11315l2.addLast(c14025l);
                    c11129l = c11129l2;
                    c11315l = c11315l2;
                    it = abstractC5921l.signatures(c14025l).iterator();
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.f36553l;
                    C11315l c11315l3 = (C11315l) this.f36558l;
                    C11129l c11129l3 = (C11129l) this.f36555l;
                    AbstractC2829l.crashlytics(obj);
                    c11315l = c11315l3;
                    c11129l = c11129l3;
                }
                while (it.hasNext()) {
                    C14025l c14025l2 = (C14025l) it.next();
                    this.f36555l = c11129l;
                    this.f36558l = c11315l;
                    this.f36553l = it;
                    this.f36556l = 1;
                    if (AbstractC12446l.yandex(c11129l, abstractC5921l, c11315l, c14025l2, false, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f36556l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f36556l = 1;
                    if (AbstractC18112l.admob((C17249l) this.f36555l, (InterfaceC2262l) this.f36558l, (C1304l) this.f36553l, (Function3) obj3, (Function1) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f36552l;
        Object obj2 = this.f36557l;
        Object obj3 = this.f36554l;
        switch (i) {
            case 0:
                purchase purchaseVar = new purchase((C14025l) obj3, (AbstractC5921l) obj2, interfaceC14029l);
                purchaseVar.f36555l = obj;
                return purchaseVar;
            default:
                purchase purchaseVar2 = new purchase(interfaceC14029l, (InterfaceC2262l) this.f36558l, (C1304l) this.f36553l, (Function1) obj2, (Function3) obj3);
                purchaseVar2.f36555l = obj;
                return purchaseVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36552l) {
            case 0:
                return ((purchase) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((purchase) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public purchase(C14025l c14025l, AbstractC5921l abstractC5921l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36554l = c14025l;
        this.f36557l = abstractC5921l;
    }
}
