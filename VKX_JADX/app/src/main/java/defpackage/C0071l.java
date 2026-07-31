package defpackage;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0071l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f975l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f975l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object c18435l;
        InterfaceC9473l interfaceC9473lMo1516l;
        switch (this.f975l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                return Choreographer.getInstance();
            case 1:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                C11644l c11644l = C6336l.loadAd;
                C5198l c5198lM3161l = c11644l.m3161l();
                if (c5198lM3161l != null) {
                    c5198lM3161l.close();
                }
                ((C1008l) c11644l.f23362l).smaato(null);
                c11644l.m3142l((InterfaceC2262l) c11644l.f23357l, (C12125l) c11644l.f23358l, (C2063l) c11644l.f23361l, (C2063l) c11644l.f23360l, true);
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 7:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 8:
                AbstractC2829l.crashlytics(obj);
                return Boolean.TRUE;
            case 9:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 10:
                AbstractC2829l.crashlytics(obj);
                C7268l.f15111l.getClass();
                C7268l.loadAd();
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                String str = AbstractC8942l.yandex;
                return new C10882l(Thread.currentThread().getId());
            case 12:
                AbstractC2829l.crashlytics(obj);
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                C10507l c10507lCrashlytics = c16076l.crashlytics();
                if (c10507lCrashlytics != null) {
                    return c10507lCrashlytics.loadAd;
                }
                return null;
            case 13:
                AbstractC2829l.crashlytics(obj);
                VKXApplication.Companion companion2 = VKXApplication.f36628l;
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                C10507l c10507lCrashlytics2 = c16076l2.crashlytics();
                if (c10507lCrashlytics2 != null) {
                    return c10507lCrashlytics2.loadAd;
                }
                return null;
            case 14:
                AbstractC2829l.crashlytics(obj);
                try {
                    C11610l c11610l = AbstractC3629l.yandex;
                    if (c11610l == null) {
                        c11610l = null;
                    }
                    C11644l c11644l2 = new C11644l(28);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appInstanceId", String.valueOf(AbstractC4777l.f9804l.amazon()));
                    jSONObject.put("appId", "1:841415684880:android:632f429381141121");
                    Unit unit = Unit.INSTANCE;
                    String string = jSONObject.toString();
                    C11155l c11155l = C12105l.amazon;
                    c11644l2.m3145l("POST", C15655l.loadAd(string, AbstractC0775l.m674strictfp("application/json")));
                    c11644l2.m3157l("https://firebaseremoteconfig.googleapis.com/v1/projects/841415684880/namespaces/firebase:fetch");
                    ((C16543l) c11644l2.f23361l).loadAd("X-Goog-Api-Key", "AIzaSyCL17U2Q5i1NVwIcXgMOZMidSRFHyGYgwM");
                    ((C16543l) c11644l2.f23361l).loadAd("X-Android-Package", "com.vkontakte.android");
                    ((C16543l) c11644l2.f23361l).loadAd("X-Android-Cert", "48761EEF50EE53AFC4CC9C5F10E6BDE7F8F5B82F");
                    AbstractC6897l abstractC6897l = c11610l.yandex(new C17032l(c11644l2)).billing().f35907l;
                    if (abstractC6897l == null || (interfaceC9473lMo1516l = abstractC6897l.mo1516l()) == null) {
                        c18435l = null;
                    } else {
                        try {
                            C13047l c13047l = C18404l.loadAd;
                            c13047l.getClass();
                            c18435l = (C1203l) AbstractC10802l.loadAd(c13047l, AbstractC7303l.crashlytics(C1203l.Companion.serializer()), new C6309l(interfaceC9473lMo1516l, 1));
                            interfaceC9473lMo1516l.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC7876l.loadAd(interfaceC9473lMo1516l, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    c18435l = new C18435l(th3);
                }
                if (c18435l instanceof C18435l) {
                    return null;
                }
                return c18435l;
            default:
                AbstractC2829l.crashlytics(obj);
                return C9201l.loadAd(-6);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f975l) {
            case 0:
                return new C0071l(2, interfaceC14029l, 0);
            case 1:
                return new C0071l(2, interfaceC14029l, 1);
            case 2:
                return new C0071l(2, interfaceC14029l, 2);
            case 3:
                return new C0071l(2, interfaceC14029l, 3);
            case 4:
                return new C0071l(2, interfaceC14029l, 4);
            case 5:
                return new C0071l(2, interfaceC14029l, 5);
            case 6:
                return new C0071l(2, interfaceC14029l, 6);
            case 7:
                return new C0071l(2, interfaceC14029l, 7);
            case 8:
                return new C0071l(2, interfaceC14029l, 8);
            case 9:
                return new C0071l(2, interfaceC14029l, 9);
            case 10:
                return new C0071l(2, interfaceC14029l, 10);
            case 11:
                return new C0071l(2, interfaceC14029l, 11);
            case 12:
                return new C0071l(2, interfaceC14029l, 12);
            case 13:
                return new C0071l(2, interfaceC14029l, 13);
            case 14:
                return new C0071l(2, interfaceC14029l, 14);
            default:
                return new C0071l(2, interfaceC14029l, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f975l) {
            case 0:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                ads((InterfaceC14029l) obj2, (C3850l) obj);
                Unit unit = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit);
                return unit;
            case 2:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                ads((InterfaceC14029l) obj2, (C11841l) obj);
                Unit unit2 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit2);
                return unit2;
            case 4:
                ads((InterfaceC14029l) obj2, (InterfaceC6942l) obj);
                Unit unit3 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit3);
                return unit3;
            case 5:
                ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj);
                Unit unit4 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit4);
                return unit4;
            case 6:
                if (obj != null) {
                    C18725l.loadAd();
                    return null;
                }
                ads((InterfaceC14029l) obj2, null);
                Unit unit5 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit5);
                return unit5;
            case 7:
                ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj);
                Unit unit6 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit6);
                return unit6;
            case 8:
                ((C0071l) ads((InterfaceC14029l) obj2, obj)).Signature(Unit.INSTANCE);
                return Boolean.TRUE;
            case 9:
                ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj);
                Unit unit7 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit7);
                return unit7;
            case 10:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0071l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
