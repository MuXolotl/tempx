package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٖؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16193l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f31682l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Context f31683l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5518l f31684l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f31685l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f31686l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C3445l f31687l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31688l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f31689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16193l(Context context, C3445l c3445l, AbstractC5518l abstractC5518l, Bundle bundle, Function4 function4, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f31683l = context;
        this.f31687l = c3445l;
        this.f31684l = abstractC5518l;
        this.f31689l = bundle;
        this.f31686l = function4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c A[RETURN] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C2319l c2319l;
        boolean zBooleanValue;
        C2319l c2319l2;
        boolean z;
        Object objInvoke;
        int i = this.f31688l;
        C3445l c3445l = this.f31687l;
        Context context = this.f31683l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C2319l c2319l3 = (C2319l) this.f31682l;
            String strCrashlytics = AbstractC13743l.crashlytics(c3445l.yandex);
            this.f31682l = c2319l3;
            this.f31688l = 1;
            Object objYandex = c2319l3.yandex(context, strCrashlytics, this);
            if (objYandex != enumC9342l) {
                c2319l = c2319l3;
                obj = objYandex;
            }
            return enumC9342l;
        }
        if (i == 1) {
            c2319l = (C2319l) this.f31682l;
            AbstractC2829l.crashlytics(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.f31685l;
            c2319l2 = (C2319l) this.f31682l;
            AbstractC2829l.crashlytics(obj);
        }
        zBooleanValue = z;
        c2319l = c2319l2;
        C4043l c4043l = (C4043l) c2319l.yandex.get(AbstractC13743l.crashlytics(c3445l.yandex));
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.f31682l = null;
        this.f31688l = 3;
        objInvoke = this.f31686l.invoke(c2319l, c4043l, boolValueOf, this);
        if (objInvoke == enumC9342l) {
            return enumC9342l;
        }
        return objInvoke;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C4043l c4043l2 = (C4043l) c2319l.yandex.get(AbstractC13743l.crashlytics(c3445l.yandex));
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            this.f31682l = null;
            this.f31688l = 3;
            objInvoke = this.f31686l.invoke(c2319l, c4043l2, boolValueOf2, this);
            if (objInvoke == enumC9342l) {
                return objInvoke;
            }
        } else {
            C4043l c4043l3 = new C4043l(this.f31684l, c3445l, this.f31689l);
            this.f31682l = c2319l;
            this.f31685l = zBooleanValue;
            this.f31688l = 2;
            if (c2319l.crashlytics(context, c4043l3, this) != enumC9342l) {
                c2319l2 = c2319l;
                z = zBooleanValue;
                zBooleanValue = z;
                c2319l = c2319l2;
                C4043l c4043l4 = (C4043l) c2319l.yandex.get(AbstractC13743l.crashlytics(c3445l.yandex));
                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                this.f31682l = null;
                this.f31688l = 3;
                objInvoke = this.f31686l.invoke(c2319l, c4043l4, boolValueOf3, this);
                if (objInvoke == enumC9342l) {
                    return objInvoke;
                }
            }
        }
        return enumC9342l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C16193l c16193l = new C16193l(this.f31683l, this.f31687l, this.f31684l, this.f31689l, this.f31686l, interfaceC14029l);
        c16193l.f31682l = obj;
        return c16193l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16193l) ads((InterfaceC14029l) obj2, (C2319l) obj)).Signature(Unit.INSTANCE);
    }
}
