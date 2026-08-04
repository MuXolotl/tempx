package defpackage;

import android.webkit.WebView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponse;

/* JADX INFO: renamed from: lٕؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0786l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f2371l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2372l;

    public /* synthetic */ C0786l(int i, Function1 function1) {
        this.f2372l = i;
        this.f2371l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4608l c4608l;
        switch (this.f2372l) {
            case 0:
                this.f2371l.invoke(((VKResponse) obj).yandex);
                return Unit.INSTANCE;
            case 1:
                this.f2371l.invoke(((VKResponse) obj).yandex);
                return Unit.INSTANCE;
            case 2:
                this.f2371l.invoke((C16522l) obj);
                return Unit.INSTANCE;
            case 3:
                C0187l c0187l = (C0187l) obj;
                return Double.valueOf((c0187l == null || (c4608l = (C4608l) this.f2371l.invoke(c0187l)) == null) ? 50.0d : c4608l.yandex(c0187l));
            case 4:
                Function1 function1 = this.f2371l;
                InterfaceC11189l interfaceC11189l = (InterfaceC11189l) obj;
                if (!(interfaceC11189l instanceof C18395l)) {
                    C8339l.smaato("Node is not a GestureNode instance");
                    return null;
                }
                InterfaceC0421l interfaceC0421l = ((C18395l) interfaceC11189l).f35932l;
                InterfaceC0421l interfaceC0421l2 = interfaceC0421l != null ? interfaceC0421l : null;
                return Boolean.valueOf(interfaceC0421l2 != null ? ((Boolean) function1.invoke(interfaceC0421l2)).booleanValue() : true);
            case 5:
                this.f2371l.invoke(((List) obj).get(0));
                return Unit.INSTANCE;
            case 6:
                Function1 function2 = this.f2371l;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function2.invoke(bool);
                return Unit.INSTANCE;
            case 7:
                throw AbstractC12589l.signatures(obj);
            case 8:
                Function1 function3 = this.f2371l;
                if (((EnumC11822l) obj).loadAd()) {
                    function3.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 9:
                this.f2371l.invoke("");
                return Unit.INSTANCE;
            case 10:
                AbstractC18620l abstractC18620l = (AbstractC18620l) this.f2371l.invoke((C8739l) obj);
                synchronized (AbstractC9620l.crashlytics) {
                    AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(abstractC18620l.mopub());
                    Unit unit = Unit.INSTANCE;
                }
                return abstractC18620l;
            case 11:
                Function1 function4 = this.f2371l;
                Long l = (Long) obj;
                l.getClass();
                return function4.invoke(l);
            case 12:
                return new C12324l((EnumC16440l) obj, this.f2371l);
            case 13:
                return new C7463l((EnumC12805l) obj, this.f2371l);
            case 14:
                Function1 function5 = this.f2371l;
                if (((EnumC11822l) obj).loadAd()) {
                    function5.invoke(0);
                }
                return Unit.INSTANCE;
            case 15:
                Function1 function6 = this.f2371l;
                if (((EnumC11822l) obj).loadAd()) {
                    function6.invoke(1);
                }
                return Unit.INSTANCE;
            case 16:
                this.f2371l.invoke((List) obj);
                return Unit.INSTANCE;
            default:
                this.f2371l.invoke((WebView) obj);
                return Unit.INSTANCE;
        }
    }
}
