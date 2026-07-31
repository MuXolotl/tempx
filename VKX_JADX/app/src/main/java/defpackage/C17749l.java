package defpackage;

import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lٌؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17749l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f34570l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f34571l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34572l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f34573l;

    public C17749l(AbstractC15719l abstractC15719l, C16412l c16412l, C1461l c1461l) {
        this.f34572l = 0;
        this.f34573l = abstractC15719l;
        this.f34571l = c16412l;
        this.f34570l = c1461l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f34572l;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f34570l;
        Object obj2 = this.f34571l;
        Object obj3 = this.f34573l;
        switch (i) {
            case 0:
                return new C9940l((AbstractC15719l) obj3, (C16412l) obj2, (C1461l) obj);
            case 1:
                ((C13849l) obj2).m3787finally((C2391l) obj, (C6393l) obj3);
                return Unit.INSTANCE;
            case 2:
                ((InterfaceC8714l) obj).setValue((MainArtist) obj2);
                ((InterfaceC8714l) obj3).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                return ((C2630l) obj2).loadAd((ByteArrayInputStream) obj, (C3429l) ((C0511l) ((AbstractC2842l) obj3).loadAd.f15738l).metrica);
            case 4:
                C5160l c5160l = (C5160l) obj2;
                Class cls = (Class) obj;
                C3624l c3624l = (C3624l) obj3;
                Class cls2 = c5160l.f11212l;
                if (AbstractC8576l.yandex(cls2.getSuperclass(), cls)) {
                    return cls2.getGenericSuperclass();
                }
                int iM2398catch = AbstractC8669l.m2398catch(cls, cls2.getInterfaces());
                if (iM2398catch >= 0) {
                    return cls2.getGenericInterfaces()[iM2398catch];
                }
                C17132l.adcel("No superclass of ", c5160l, " in Java reflection for ", c3624l);
                return null;
            case 5:
                AbstractC8028l abstractC8028l = (AbstractC8028l) obj2;
                C16412l c16412l = ((C7757l) abstractC8028l.loadAd.f20463l).yandex;
                C11239l c11239l = new C11239l(abstractC8028l, (C0865l) obj, (C10700l) obj3);
                c16412l.getClass();
                return new C9004l(c16412l, c11239l);
            case 6:
                ((C17408l) obj2).f33914l.setValue(Boolean.FALSE);
                AbstractC10999l.mopub((InterfaceC2262l) obj, null, 0, new C8912l((EnumC10468l) obj3, interfaceC14029l, 25), 3);
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj2).invoke((EnumC12999l) obj);
                int i2 = AbstractC8007l.yandex;
                ((InterfaceC8714l) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                String str = (String) obj2;
                AbstractC0601l abstractC0601l = (AbstractC0601l) obj;
                C0059l c0059l = (C0059l) obj3;
                Object obj4 = c0059l.f26698l;
                String str2 = c0059l.f26701l;
                C0711l c0711lCrashlytics = AbstractC0601l.f2039l.crashlytics(str);
                if (c0711lCrashlytics != null) {
                    return abstractC0601l.m659for(Integer.parseInt((String) ((C8892l) c0711lCrashlytics.yandex()).get(1)), str);
                }
                return abstractC0601l instanceof C9539l ? new C8786l(abstractC0601l, str, obj4, abstractC0601l.m658else(str2, str)) : new C2000l(abstractC0601l, str2, str, obj4);
            case 9:
                String str3 = (String) obj2;
                AbstractC0601l abstractC0601l2 = (AbstractC0601l) obj;
                C18200l c18200l = (C18200l) obj3;
                Object obj5 = c18200l.f26698l;
                String str4 = c18200l.f26701l;
                C0711l c0711lCrashlytics2 = AbstractC0601l.f2039l.crashlytics(str3);
                if (c0711lCrashlytics2 != null) {
                    return abstractC0601l2.m659for(Integer.parseInt((String) ((C8892l) c0711lCrashlytics2.yandex()).get(1)), str3);
                }
                return abstractC0601l2 instanceof C9539l ? new C8814l(abstractC0601l2, str3, obj5, abstractC0601l2.m658else(str4, str3)) : new C5262l(abstractC0601l2, str4, str3, obj5);
            case 10:
                AbstractC0601l abstractC0601l3 = (AbstractC0601l) obj2;
                C0544l c0544l = (C0544l) obj;
                Object obj6 = c0544l.f26698l;
                String str5 = c0544l.f26701l;
                String str6 = (String) obj3;
                return abstractC0601l3 instanceof C9539l ? new C3436l(abstractC0601l3, str6, obj6, abstractC0601l3.m658else(str5, str6)) : new C15060l(abstractC0601l3, str5, str6, obj6);
            case 11:
                AbstractC0601l abstractC0601l4 = (AbstractC0601l) obj2;
                C0114l c0114l = (C0114l) obj;
                Object obj7 = c0114l.f26698l;
                String str7 = c0114l.f26701l;
                String str8 = (String) obj3;
                return abstractC0601l4 instanceof C9539l ? new C4458l(abstractC0601l4, str8, obj7, abstractC0601l4.m658else(str7, str8)) : new C12022l(abstractC0601l4, str7, str8, obj7);
            default:
                if (((Boolean) ((InterfaceC12244l) obj3).getValue()).booleanValue()) {
                    ((C17004l) obj2).amazon.invoke();
                } else {
                    new C14107l().Signature(((AbstractC14968l) obj).isVip());
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17749l(Object obj, Object obj2, Object obj3, int i) {
        this.f34572l = i;
        this.f34571l = obj;
        this.f34570l = obj2;
        this.f34573l = obj3;
    }
}
