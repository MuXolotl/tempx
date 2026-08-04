package defpackage;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؔؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2354l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5115l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5116l;

    public C2354l(InterfaceC2262l interfaceC2262l, C12362l c12362l) {
        this.f5116l = 11;
        this.f5115l = c12362l;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) throws Throwable {
        Function0 function0;
        switch (this.f5116l) {
            case 0:
                C10023l c10023l = (C10023l) this.f5115l;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2847l.inmobi(c10023l.isVip(), (View) c10023l.f20419l);
                }
                return Unit.INSTANCE;
            case 1:
                ((C0554l) this.f5115l).mo635interface();
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                C16552l c16552l = AbstractC11463l.yandex;
                Object objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex.f6462l, new C17097l(iIntValue, (AppActivity) this.f5115l, (InterfaceC14029l) null), interfaceC14029l);
                return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
            case 3:
                return yandex((AbstractC7317l) obj, interfaceC14029l);
            case 4:
                Object objBilling = ((C5616l) this.f5115l).billing(interfaceC14029l, new Float(AbstractC3939l.yandex.yandex(((C0560l) obj).crashlytics)));
                return objBilling == EnumC9342l.f19165l ? objBilling : Unit.INSTANCE;
            case 5:
                AbstractC10252l abstractC10252l = (AbstractC10252l) obj;
                C11751l c11751l = (C11751l) this.f5115l;
                C1008l c1008l = c11751l.f23541l;
                if (abstractC10252l instanceof C17481l) {
                    c1008l.getClass();
                    c1008l.remoteconfig(null, abstractC10252l);
                    return Unit.INSTANCE;
                }
                if (abstractC10252l instanceof C12163l) {
                    c1008l.getClass();
                    c1008l.remoteconfig(null, abstractC10252l);
                    return Unit.INSTANCE;
                }
                if (!(abstractC10252l instanceof C16495l)) {
                    return Unit.INSTANCE;
                }
                C8490l c8490l = c11751l.f23534l;
                Unit unit = Unit.INSTANCE;
                Object objIsPro = c8490l.isPro(unit, interfaceC14029l);
                return objIsPro == EnumC9342l.f19165l ? objIsPro : unit;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C18449l c18449l = (C18449l) this.f5115l;
                if (zBooleanValue) {
                    PopupWindow popupWindow = (PopupWindow) c18449l.f36012l;
                    if (popupWindow != null && popupWindow.isShowing() && (function0 = ((C12606l) c18449l.f36009l).billing) != null) {
                        function0.invoke();
                    }
                    PopupWindow popupWindow2 = (PopupWindow) c18449l.f36012l;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
                return Unit.INSTANCE;
            case 7:
                C0554l c0554l = ((C5719l) this.f5115l).crashlytics;
                c0554l.m629case().updateCursorAnchorInfo((View) c0554l.f1958l, (CursorAnchorInfo) obj);
                return Unit.INSTANCE;
            case 8:
                C0360l c0360l = (C0360l) this.f5115l;
                if (c0360l.admob.m2948class() instanceof C15647l) {
                    return Unit.INSTANCE;
                }
                Object objAdmob = c0360l.admob(true, interfaceC14029l);
                return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
            case 9:
                if (((EnumC8981l) obj).compareTo(EnumC8981l.f18520l) <= 0) {
                    C16604l c16604l = (C16604l) this.f5115l;
                    C1625l c1625l = c16604l.f32583l;
                    C11925l c11925lYandex = c1625l.yandex();
                    if (c11925lYandex != null) {
                        ((InterfaceC3685l) AbstractC13402l.loadAd(c16604l, AbstractC4751l.mopub)).yandex(c11925lYandex);
                    }
                    c1625l.billing.setValue(null);
                }
                return Unit.INSTANCE;
            case 10:
                ((C18307l) this.f5115l).f35805l.subs(((Number) obj).floatValue());
                return Unit.INSTANCE;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C12362l c12362l = (C12362l) this.f5115l;
                if (!zBooleanValue2) {
                    RunnableC5360l runnableC5360l = c12362l.crashlytics;
                    if (runnableC5360l != null) {
                        c12362l.yandex.removeCallbacks(runnableC5360l);
                    }
                    c12362l.crashlytics = null;
                } else if (c12362l.crashlytics == null) {
                    c12362l.loadAd();
                }
                return Unit.INSTANCE;
            case 12:
                C3278l c3278l = (C3278l) obj;
                ((C12513l) this.f5115l).invoke(Boolean.valueOf(c3278l.f7019l), Boolean.valueOf(c3278l.f7020l));
                return Unit.INSTANCE;
            case 13:
                String str = (String) obj;
                C4261l c4261l = (C4261l) this.f5115l;
                c4261l.f8748l.purchase(str.length() > 0);
                Object objM1517import = C4261l.m1517import(c4261l, str, interfaceC14029l);
                return objM1517import == EnumC9342l.f19165l ? objM1517import : Unit.INSTANCE;
            case 14:
                C5198l c5198l = (C5198l) this.f5115l;
                if (c5198l.f11271l.yandex != null) {
                    ((C11534l) c5198l.f33214l).crashlytics("REMOVING INITIAL VERSION", new Object[0]);
                    c5198l.f11271l.yandex = null;
                }
                ((C5198l) this.f5115l).f11262l.vip();
                Object objIsPro2 = ((C5198l) this.f5115l).f11263l.isPro(new C4269l(13), interfaceC14029l);
                return objIsPro2 == EnumC9342l.f19165l ? objIsPro2 : Unit.INSTANCE;
            case 15:
                InterfaceC12553l interfaceC12553l = (InterfaceC12553l) obj;
                C15308l c15308l = (C15308l) this.f5115l;
                if ((interfaceC12553l instanceof C12951l) || (interfaceC12553l instanceof C7008l)) {
                    c15308l.subs(c15308l.admob() + 1);
                } else if ((interfaceC12553l instanceof C3426l) || (interfaceC12553l instanceof C17768l) || (interfaceC12553l instanceof C10129l)) {
                    c15308l.subs(c15308l.admob() - 1);
                }
                return Unit.INSTANCE;
            case 16:
                C6539l c6539l = (C6539l) obj;
                C14567l c14567l = (C14567l) this.f5115l;
                c14567l.admob = c6539l;
                if (c14567l.isPro) {
                    c14567l.isPro = false;
                    c14567l.crashlytics();
                }
                Object objYandex = C14567l.yandex(c14567l, c6539l.yandex.yandex, EnumC14549l.f28492l, interfaceC14029l);
                return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C3597l c3597l = (C3597l) obj;
                C17219l c17219l = (C17219l) this.f5115l;
                int i = c17219l.f33424l;
                C10227l c10227l = (C10227l) c17219l.f33426l;
                ListIterator listIterator = c10227l.listIterator(0);
                boolean z = false;
                while (true) {
                    C13376l c13376l = (C13376l) listIterator;
                    if (c13376l.hasNext()) {
                        if (((InterfaceC11209l) c13376l.next()).loadAd(c3597l)) {
                            z = true;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        if (i == -1 || !z) {
                            return Unit.INSTANCE;
                        }
                        c17219l.f33424l = -1;
                        ListIterator listIterator2 = c10227l.listIterator(0);
                        while (true) {
                            C13376l c13376l2 = (C13376l) listIterator2;
                            if (!c13376l2.hasNext()) {
                                Object objStartapp = c17219l.startapp(i, interfaceC14029l);
                                return objStartapp == EnumC9342l.f19165l ? objStartapp : Unit.INSTANCE;
                            }
                            ((InterfaceC11209l) c13376l2.next()).release();
                        }
                    }
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C4240l) this.f5115l).f8674l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return loadAd(interfaceC14029l);
            case 20:
                AbstractC5387l abstractC5387l = (AbstractC5387l) obj;
                C17266l c17266l = (C17266l) this.f5115l;
                synchronized (c17266l.purchase) {
                    try {
                        if (abstractC5387l instanceof C15995l) {
                            C1156l c1156l = new C1156l((C2910l) ((C15995l) abstractC5387l).yandex);
                            c17266l.mopub = c1156l;
                            c17266l.loadAd(new C15995l(c1156l));
                        } else {
                            c17266l.loadAd(abstractC5387l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2737l abstractC2737l = (AbstractC2737l) obj;
                if (abstractC2737l instanceof C6033l) {
                    C6033l c6033l = (C6033l) abstractC2737l;
                    ((WebView) this.f5115l).loadUrl(c6033l.yandex, c6033l.loadAd);
                } else if (!(abstractC2737l instanceof C8184l)) {
                    C18725l.billing();
                    return null;
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object loadAd(InterfaceC14029l interfaceC14029l) {
        C2553l c2553l;
        View view = (View) this.f5115l;
        if (interfaceC14029l instanceof C2553l) {
            c2553l = (C2553l) interfaceC14029l;
            int i = c2553l.f5561l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2553l.f5561l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2553l = new C2553l(this, interfaceC14029l);
            }
        } else {
            c2553l = new C2553l(this, interfaceC14029l);
        }
        Object objFirebase = c2553l.f5560l;
        int i2 = c2553l.f5561l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (AbstractC0676l.crashlytics(view.getContext())) {
                InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
                c2553l.f5561l = 1;
                objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c2553l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objFirebase);
        if (!((C18554l) objFirebase).f36219l) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            int iPurchase = AbstractC10999l.purchase(6);
            if (iPurchase != -1) {
                view.performHapticFeedback(iPurchase, 1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object yandex(AbstractC7317l abstractC7317l, InterfaceC14029l interfaceC14029l) {
        C18633l c18633l;
        AbstractServiceC5477l abstractServiceC5477l = (AbstractServiceC5477l) this.f5115l;
        if (interfaceC14029l instanceof C18633l) {
            c18633l = (C18633l) interfaceC14029l;
            int i = c18633l.f36418l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18633l.f36418l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18633l = new C18633l(this, interfaceC14029l);
            }
        } else {
            c18633l = new C18633l(this, interfaceC14029l);
        }
        Object obj = c18633l.f36417l;
        int i2 = c18633l.f36418l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (abstractC7317l instanceof C9475l) {
                abstractServiceC5477l.f11729l = new CancellationSignal();
                abstractServiceC5477l.mopub().f32029l = false;
                abstractServiceC5477l.subs();
                return Unit.INSTANCE;
            }
            abstractServiceC5477l.f11724l = abstractC7317l;
            abstractServiceC5477l.crashlytics();
            c18633l.f36418l = 1;
            Object objBilling = abstractServiceC5477l.billing(abstractC7317l, c18633l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        abstractServiceC5477l.f11731l--;
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2354l(int i, Object obj) {
        this.f5116l = i;
        this.f5115l = obj;
    }

    public C2354l(C17219l c17219l, InterfaceC2262l interfaceC2262l) {
        this.f5116l = 17;
        this.f5115l = c17219l;
    }
}
