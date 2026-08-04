package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10469l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f21327l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f21328l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ List f21329l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f21330l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ List f21331l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C6267l f21332l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f21333l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ List f21334l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10469l(C6267l c6267l, List list, List list2, List list3, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f21332l = c6267l;
        this.f21329l = list;
        this.f21334l = list2;
        this.f21331l = list3;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        List listAsList;
        List listAsList2;
        List listAsList3;
        int i = this.f21328l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#update3aRegions");
                }
                C6267l c6267l = this.f21332l;
                List list = this.f21329l;
                List list2 = this.f21334l;
                List list3 = this.f21331l;
                C2667l c2667lYandex = c6267l.crashlytics.yandex();
                this.f21330l = list;
                this.f21333l = list2;
                this.f21327l = list3;
                this.f21328l = 1;
                obj = c2667lYandex.yandex(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                listAsList = list;
                listAsList2 = list2;
                listAsList3 = list3;
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listAsList3 = this.f21327l;
                listAsList2 = this.f21333l;
                listAsList = this.f21330l;
                AbstractC2829l.crashlytics(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                C10069l c10069l = (C10069l) autoCloseable;
                if (listAsList == null) {
                    listAsList = Arrays.asList(AbstractC18123l.yandex);
                }
                List list4 = listAsList;
                if (listAsList2 == null) {
                    listAsList2 = Arrays.asList(AbstractC18123l.yandex);
                }
                List list5 = listAsList2;
                if (listAsList3 == null) {
                    listAsList3 = Arrays.asList(AbstractC18123l.yandex);
                }
                InterfaceC1142l interfaceC1142lM3895throws = AbstractC14814l.m3895throws(c10069l, null, null, null, list4, list5, listAsList3, 7);
                AbstractC1214l.yandex(autoCloseable, null);
                return interfaceC1142lM3895throws;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return C6267l.smaato;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C10469l(this.f21332l, this.f21329l, this.f21334l, this.f21331l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C10469l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
