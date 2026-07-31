package defpackage;

import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8467l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f17504l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17505l;

    public C8467l(C10038l c10038l, C15284l c15284l) {
        this.f17505l = 5;
        this.f17504l = c10038l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C14785l c14785l;
        String property;
        List listM2415super;
        int i = this.f17505l;
        int length = 0;
        Object obj = this.f17504l;
        switch (i) {
            case 0:
                return new C14805l((C12955l) obj);
            case 1:
                C8975l c8975l = (C8975l) obj;
                Type typeAmazon = AbstractC10565l.amazon(c8975l);
                return typeAmazon == null ? c8975l.isPro().smaato() : typeAmazon;
            case 2:
                C7474l c7474l = (C7474l) obj;
                AbstractC6242l abstractC6242l = c7474l.f15473l;
                if ((abstractC6242l.ad() instanceof C9539l) || AbstractC7572l.subs(abstractC6242l)) {
                    return (Type) abstractC6242l.isPro().yandex().get(c7474l.f15471l);
                }
                C8936l.smaato(abstractC6242l, "Only constructors and top-level callables are supported for now: ");
                return null;
            case 3:
                return AbstractC15096l.amazon((AbstractC1952l) obj, true);
            case 4:
                return new C17906l((C4615l) obj);
            case 5:
                ((C13772l) ((C7757l) ((C10038l) obj).f20463l).ad).getClass();
                return AbstractC16901l.m4229l(new ArrayList());
            case 6:
                AbstractC17948l.admob((View) obj, false);
                return Unit.INSTANCE;
            case 7:
                Function0 function0 = ((C2314l) obj).f5024l;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            case 8:
                return (EnumC16440l) ((C10086l) ((C12324l) obj).yandex.crashlytics).getValue();
            case 9:
                AbstractC9707l abstractC9707l = (AbstractC9707l) obj;
                Member memberLoadAd = abstractC9707l.subs().isPro().loadAd();
                int i2 = 8;
                if (memberLoadAd instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberLoadAd).getModifiers())) {
                        C8936l.smaato(memberLoadAd, "Only static methods are supported for now: ");
                        return null;
                    }
                    c14785l = new C14785l(memberLoadAd, abstractC9707l.pro(), i2);
                } else {
                    if (!(memberLoadAd instanceof Constructor)) {
                        C11467l.Signature(memberLoadAd, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberLoadAd;
                    if (AbstractC18202l.yandex.loadAd(constructor.getDeclaringClass()).subscription() && (property = System.getProperty("java.version")) != null && AbstractC16648l.isVip(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    c14785l = new C14785l(memberLoadAd, abstractC9707l.pro() + length, i2);
                }
                int i3 = c14785l.f28908l;
                Member member = (Member) c14785l.f28907l;
                if (member instanceof Method) {
                    listM2415super = AbstractC8669l.m2415super(((Method) member).getParameterAnnotations()[i3]);
                } else {
                    listM2415super = member instanceof Constructor ? AbstractC8669l.m2415super(((Constructor) member).getParameterAnnotations()[i3]) : C2580l.f5619l;
                }
                return AbstractC5592l.ads(listM2415super);
            case 10:
                return (InterfaceC7637l) ((C2252l) obj).loadAd.invoke(C14945l.amazon);
            case 11:
                return AbstractC3352l.purchase(((C12768l) obj).yandex);
            case 12:
                C17650l c17650l = (C17650l) obj;
                return c17650l.subs(AbstractC6968l.loadAd(c17650l.loadAd, null, 3));
            case 13:
                return C8741l.loadAd(EnumC5123l.f11136l, ((C2494l) obj).toString());
            case 14:
                C7206l.amazon = false;
                C7206l c7206l = C7206l.yandex;
                C7206l.amazon((EnumC10788l) obj);
                c7206l.loadAd();
                return Unit.INSTANCE;
            case 15:
                return (List) ((C0572l) obj).f1970l.getValue();
            default:
                return new AbstractC13306l[((InterfaceC6942l[]) obj).length];
        }
    }

    public /* synthetic */ C8467l(int i, Object obj) {
        this.f17505l = i;
        this.f17504l = obj;
    }
}
