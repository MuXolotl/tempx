package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0458l implements InterfaceC3710l, InterfaceC12904l, InterfaceC15600l, InterfaceC0587l, InterfaceC13232l, InterfaceC10466l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0458l f1688l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C0458l f1689l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f1690l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f1691l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1692l;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        f1689l = new C0458l(new C17879l(fValueOf2, fValueOf2), new C17879l(fValueOf, fValueOf), 1);
        f1688l = new C0458l(new C18334l(22), new C18334l(23), 2);
    }

    public C0458l(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f1692l = 0;
        ComponentName componentName2 = null;
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = AbstractC7639l.loadAd;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (listQueryBroadcastReceivers.size() > 1) {
                AbstractC6427l.vip("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                AbstractC6427l.firebase("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f1691l = new C0154l(context, bundle, str);
        } else if (i2 >= 28) {
            this.f1691l = new C15410l(context, bundle, str);
        } else {
            this.f1691l = new C1139l(context, bundle, str);
        }
        Looper looperMyLooper = Looper.myLooper();
        m553private(new C2913l(0), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        ((C1139l) this.f1691l).yandex.setMediaButtonReceiver(pendingIntent);
        this.f1690l = new C18396l(context, ((C1139l) this.f1691l).crashlytics);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C0458l m547strictfp(String... strArr) {
        try {
            C3844l[] c3844lArr = new C3844l[strArr.length];
            C0869l c0869l = new C0869l();
            for (int i = 0; i < strArr.length; i++) {
                C3631l.m1363synchronized(c0869l, strArr[i]);
                c0869l.readByte();
                c3844lArr[i] = c0869l.premium(c0869l.f2526l);
            }
            return new C0458l((String[]) strArr.clone(), AbstractC14770l.firebase(c3844lArr), 29);
        } catch (IOException e) {
            C8339l.subs(e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object ad(AbstractC3740l abstractC3740l, Object obj) {
        return null;
    }

    public void adcel(C0840l c0840l, int i, int i2, int i3) {
        int i4;
        C17893l c17893l = (C17893l) this.f1690l;
        int i5 = c17893l.f34846l;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            C1759l.firebase("MutableVector is empty.");
            return;
        } else {
            C0840l c0840l2 = (C0840l) c17893l.f34848l[i5 - 1];
            i4 = c0840l2.loadAd - c0840l2.amazon;
        }
        if (c0840l == null) {
            int i6 = i - i4;
            c0840l = new C0840l(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (c0840l.yandex > i) {
                c0840l.yandex = i;
                c0840l.crashlytics = i;
            }
            int i7 = c0840l.loadAd;
            if (i2 > i7) {
                int i8 = i7 - c0840l.amazon;
                c0840l.loadAd = i2;
                c0840l.amazon = i2 - i8;
            }
            c0840l.loadAd += i3;
        }
        c17893l.crashlytics(c0840l);
    }

    public C18563l ads() throws GeneralSecurityException {
        Integer num = (Integer) this.f1691l;
        if (num == null) {
            C18262l.ads("Key size is not set");
            return null;
        }
        if (((C17162l) this.f1690l) != null) {
            return new C18563l(num.intValue(), (C17162l) this.f1690l);
        }
        C18262l.ads("Variant is not set");
        return null;
    }

    @Override // defpackage.InterfaceC15600l
    public Object advert(C5786l c5786l, Object obj) {
        return tapsense(c5786l, obj);
    }

    @Override // defpackage.InterfaceC15600l
    public Object amazon(AbstractC15719l abstractC15719l, Object obj) {
        return null;
    }

    public C16826l applovin(C7899l c7899l, InterfaceC3588l interfaceC3588l) {
        Map mapSubscription;
        C5786l c5786l;
        InterfaceC17477l interfaceC17477lBilling = AbstractC9033l.billing((InterfaceC11865l) this.f1691l, AbstractC18719l.subs(interfaceC3588l, c7899l.f16472l), (C12014l) this.f1690l);
        if (c7899l.f16476l.size() == 0 || C8741l.purchase(interfaceC17477lBilling) || !AbstractC11125l.smaato(interfaceC17477lBilling, 5) || (c5786l = (C5786l) AbstractC16901l.m4224instanceof(interfaceC17477lBilling.adcel())) == null) {
            mapSubscription = C14054l.f27396l;
        } else {
            List listMo1007finally = c5786l.mo1007finally();
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(listMo1007finally, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
            for (Object obj : listMo1007finally) {
                linkedHashMap.put(((C17538l) obj).getName(), obj);
            }
            List<C14780l> list = c7899l.f16476l;
            ArrayList arrayList = new ArrayList();
            for (C14780l c14780l : list) {
                C17538l c17538l = (C17538l) linkedHashMap.get(AbstractC18719l.firebase(interfaceC3588l, c14780l.f28899l));
                Object c8195l = null;
                if (c17538l != null) {
                    C3498l c3498lFirebase = AbstractC18719l.firebase(interfaceC3588l, c14780l.f28899l);
                    AbstractC18041l abstractC18041lYandex = c17538l.yandex();
                    C4207l c4207l = c14780l.f28903l;
                    AbstractC0757l abstractC0757lM551native = m551native(abstractC18041lYandex, c4207l, interfaceC3588l);
                    c8195l = appmetrica(abstractC0757lM551native, abstractC18041lYandex, c4207l) ? abstractC0757lM551native : null;
                    if (c8195l == null) {
                        c8195l = new C15501l("Unexpected argument value: actual type " + c4207l.f8625l + " != expected type " + abstractC18041lYandex);
                    }
                    c8195l = new C8195l(c3498lFirebase, c8195l);
                }
                if (c8195l != null) {
                    arrayList.add(c8195l);
                }
            }
            mapSubscription = AbstractC8676l.subscription(arrayList);
        }
        return new C16826l(interfaceC17477lBilling.ad(), mapSubscription, InterfaceC5706l.f12087l);
    }

    public boolean appmetrica(AbstractC0757l abstractC0757l, AbstractC18041l abstractC18041l, C4207l c4207l) {
        int iNextInt;
        InterfaceC11865l interfaceC11865l = (InterfaceC11865l) this.f1691l;
        EnumC16484l enumC16484l = c4207l.f8625l;
        int i = enumC16484l == null ? -1 : AbstractC7175l.yandex[enumC16484l.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return AbstractC8576l.yandex(abstractC0757l.yandex(interfaceC11865l), abstractC18041l);
            }
            if (abstractC0757l instanceof C14005l) {
                Object obj = ((C14005l) abstractC0757l).yandex;
                if (((List) obj).size() == c4207l.f8637l.size()) {
                    AbstractC18041l abstractC18041lMopub = interfaceC11865l.subs().mopub(abstractC18041l);
                    if (abstractC18041lMopub != null) {
                        Iterable iterableFirebase = AbstractC14055l.firebase((Collection) obj);
                        if ((iterableFirebase instanceof Collection) && ((Collection) iterableFirebase).isEmpty()) {
                            return true;
                        }
                        Iterator it = iterableFirebase.iterator();
                        do {
                            C16991l c16991l = (C16991l) it;
                            if (!c16991l.f33123l) {
                                return true;
                            }
                            iNextInt = c16991l.nextInt();
                        } while (appmetrica((AbstractC0757l) ((List) obj).get(iNextInt), abstractC18041lMopub, (C4207l) c4207l.f8637l.get(iNextInt)));
                    }
                }
            }
            C18073l.firebase(abstractC0757l, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
        if (interfaceC17477l == null) {
            return true;
        }
        C3498l c3498l = AbstractC16860l.purchase;
        if (AbstractC16860l.loadAd(interfaceC17477l, AbstractC3333l.f7087else)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC15600l
    public Object billing(C7073l c7073l, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m548catch(ArrayList arrayList) {
        C11121l c11121l;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C6915l) arrayList.get(i)).yandex == 1) {
                try {
                    c11121l = new C11121l((C6915l) arrayList.get(i));
                } catch (C1886l unused) {
                    c11121l = null;
                }
                this.f1690l = c11121l;
            }
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object crashlytics(C17538l c17538l, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m549extends(boolean z) {
        C13491l c13491l = (C13491l) ((C10023l) ((C1770l) this.f1690l).f4179l).f20418l;
        if (c13491l.f26486l != z) {
            if (c13491l.f26487l != null) {
                C12304l c12304lYandex = C12304l.yandex();
                RunnableC12987l runnableC12987l = c13491l.f26487l;
                c12304lYandex.getClass();
                AbstractC5641l.amazon(runnableC12987l, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c12304lYandex.yandex;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c12304lYandex.loadAd.remove(runnableC12987l);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c13491l.f26486l = z;
            if (z) {
                C13491l.yandex(c13491l.f26488l, C12304l.yandex().crashlytics());
            }
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object firebase(C10486l c10486l, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m550for(int i) throws InvalidAlgorithmParameterException {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.f1691l = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        Context context = (Context) ((C14461l) this.f1691l).f28328l;
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) ((InterfaceC15897l) this.f1690l).get();
        return C15593l.yandex(C8565l.f17671l, new C7972l(23, new C17049l(0)), AbstractC11990l.yandex(interfaceC12932l), new C9871l(context, 1));
    }

    public KeyListener inmobi(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C10023l) ((C1770l) this.f1690l).f4179l).getClass();
        if (keyListener instanceof C6870l) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C6870l(keyListener);
    }

    @Override // defpackage.InterfaceC15600l
    public Object isPro(C1710l c1710l, Object obj) {
        return tapsense(c1710l, obj);
    }

    public C3797l isVip() {
        return new C3797l(DesugarCollections.unmodifiableMap((HashMap) this.f1691l), DesugarCollections.unmodifiableMap((HashMap) this.f1690l), 19);
    }

    @Override // defpackage.InterfaceC15600l
    public Object license(AbstractC11832l abstractC11832l, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC13232l
    public Object loadAd() {
        return (C18348l) this.f1691l;
    }

    @Override // defpackage.InterfaceC3710l
    public void metrica(InterfaceC1286l interfaceC1286l) {
        AbstractC14165l abstractC14165lRemoteconfig;
        C7819l c7819l = (C7819l) this.f1691l;
        C7737l c7737l = (C7737l) this.f1690l;
        AbstractC14165l abstractC14165lLoadAd = interfaceC1286l != null ? C5883l.loadAd(interfaceC1286l, c7819l.yandex, c7737l.f16240l) : null;
        if (abstractC14165lLoadAd == null && ((Boolean) AbstractC0532l.crashlytics(c7819l, AbstractC6764l.yandex)).booleanValue() && (abstractC14165lRemoteconfig = c7737l.remoteconfig()) != null) {
            abstractC14165lLoadAd = abstractC14165lRemoteconfig;
        }
        C7737l.smaato(c7737l, new C12477l(abstractC14165lLoadAd));
    }

    @Override // defpackage.InterfaceC13232l
    public boolean mopub(CharSequence charSequence, int i, int i2, C2049l c2049l) {
        if ((c2049l.crashlytics & 4) > 0) {
            return true;
        }
        if (((C18348l) this.f1691l) == null) {
            this.f1691l = new C18348l(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C14529l) this.f1690l).getClass();
        ((C18348l) this.f1691l).setSpan(new C2085l(c2049l), i, i2, 33);
        return true;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public AbstractC0757l m551native(AbstractC18041l abstractC18041l, C4207l c4207l, InterfaceC3588l interfaceC3588l) {
        boolean zBooleanValue = AbstractC1305l.f3393switch.purchase(c4207l.f8624l).booleanValue();
        EnumC16484l enumC16484l = c4207l.f8625l;
        switch (enumC16484l == null ? -1 : AbstractC7175l.yandex[enumC16484l.ordinal()]) {
            case 1:
                byte b = (byte) c4207l.f8633l;
                return zBooleanValue ? new C11889l(b) : new C14548l(b);
            case 2:
                return new C1802l(Character.valueOf((char) c4207l.f8633l));
            case 3:
                short s = (short) c4207l.f8633l;
                return zBooleanValue ? new C11889l(s) : new C3001l(s);
            case 4:
                int i = (int) c4207l.f8633l;
                return zBooleanValue ? new C11889l(i) : new C18009l(i);
            case 5:
                long j = c4207l.f8633l;
                return zBooleanValue ? new C11889l(j) : new C16954l(j);
            case 6:
                return new C4823l(c4207l.f8632l);
            case 7:
                return new C4823l(c4207l.f8636l);
            case 8:
                return new C4823l(Boolean.valueOf(c4207l.f8633l != 0));
            case 9:
                return new C7391l(interfaceC3588l.getString(c4207l.f8626l));
            case 10:
                return new C16634l(AbstractC18719l.subs(interfaceC3588l, c4207l.f8627l), c4207l.f8634l);
            case 11:
                return new C17452l(AbstractC18719l.subs(interfaceC3588l, c4207l.f8627l), AbstractC18719l.firebase(interfaceC3588l, c4207l.f8635l));
            case 12:
                return new C18438l(applovin(c4207l.f8630l, interfaceC3588l));
            case 13:
                List list = c4207l.f8637l;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m551native(((InterfaceC11865l) this.f1691l).subs().purchase(), (C4207l) it.next(), interfaceC3588l));
                }
                return new C1691l(arrayList, abstractC18041l);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c4207l.f8625l + " (expected " + abstractC18041l + ')').toString());
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public synchronized Map m552package() {
        try {
            if (((Map) this.f1690l) == null) {
                this.f1690l = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f1691l));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f1690l;
    }

    public void premium() {
        ((C17893l) this.f1691l).isPro();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m553private(AbstractC0294l abstractC0294l, Handler handler) {
        C1139l c1139l = (C1139l) this.f1691l;
        synchronized (c1139l.amazon) {
            c1139l.smaato = abstractC0294l;
            c1139l.yandex.setCallback((C13123l) abstractC0294l.purchase, handler);
            abstractC0294l.m409case(c1139l, handler);
        }
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        return new C12160l((Context) this.f1691l, ((InterfaceC0587l) this.f1690l).pro());
    }

    @Override // defpackage.InterfaceC12904l
    public InterfaceC16588l purchase(InterfaceC1388l interfaceC1388l) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1690l;
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private();
        Object c2136l = concurrentHashMap.get(clsMo1730private);
        if (c2136l == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsMo1730private, (c2136l = new C2136l((InterfaceC16588l) ((Function1) this.f1691l).invoke(interfaceC1388l))))) != null) {
            c2136l = objPutIfAbsent;
        }
        return ((C2136l) c2136l).yandex;
    }

    public void remoteconfig(Enum r2, Object obj) {
        ((HashMap) this.f1691l).put(r2, obj);
        ((HashMap) this.f1690l).put(obj, r2);
    }

    public void signatures(Object obj, String str) {
        HashMap map = (HashMap) this.f1691l;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f1690l).remove(str);
    }

    @Override // defpackage.InterfaceC15600l
    public Object smaato(C9522l c9522l, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC15600l
    public Object startapp(C10202l c10202l, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC15600l
    public Object subscription(C13437l c13437l, Object obj) {
        int i;
        AbstractC0601l abstractC0601l = (AbstractC0601l) this.f1690l;
        if (c13437l.mo1478l().isEmpty()) {
            i = (c13437l.f26358l != null ? 1 : 0) + (c13437l.f26355l != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (c13437l.f26357l) {
            if (i == -1) {
                return new C8783l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 0) {
                return new C5262l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 1) {
                return new C12022l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 2) {
                return new C16994l(abstractC0601l, c13437l, C4233l.subs);
            }
        } else {
            if (i == -1) {
                return new C9558l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 0) {
                return new C2000l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 1) {
                return new C15060l(abstractC0601l, c13437l, C4233l.subs);
            }
            if (i == 2) {
                return new C15041l(abstractC0601l, c13437l, C4233l.subs);
            }
        }
        C11467l.Signature(c13437l, "Unsupported property: ");
        return null;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m554synchronized(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1691l).getContext().obtainStyledAttributes(attributeSet, AbstractC14657l.subs, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m549extends(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object tapsense(InterfaceC4884l interfaceC4884l, Object obj) {
        return new C15015l((AbstractC0601l) this.f1691l, interfaceC4884l);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m555throw(C16830l c16830l) {
        RemoteCallbackList remoteCallbackList;
        C1139l c1139l = (C1139l) this.f1691l;
        c1139l.mopub = c16830l;
        synchronized (c1139l.amazon) {
            int iBeginBroadcast = c1139l.billing.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = c1139l.billing;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((InterfaceC3145l) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).subscription(c16830l);
                } catch (RemoteException | SecurityException e) {
                    AbstractC6427l.subs("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = c1139l.yandex;
        if (c16830l.f32857l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(c16830l.f32853l, c16830l.f32852l, c16830l.f32856l, c16830l.f32851l);
            builder.setBufferedPosition(c16830l.f32849l);
            builder.setActions(c16830l.f32855l);
            builder.setErrorMessage(c16830l.f32850l);
            for (C5388l c5388l : c16830l.f32858l) {
                PlaybackState.CustomAction customActionBuild = c5388l.f11536l;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(c5388l.f11535l, c5388l.f11534l, c5388l.f11533l);
                    builder2.setExtras(c5388l.f11537l);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(c16830l.f32854l);
            builder.setExtras(c16830l.f32860l);
            c16830l.f32857l = builder.build();
        }
        mediaSession.setPlaybackState(c16830l.f32857l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public InterfaceC10835l m556throws() {
        return (InterfaceC10835l) ((C10086l) this.f1690l).getValue();
    }

    public String toString() {
        switch (this.f1692l) {
            case 11:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                C17893l c17893l = (C17893l) this.f1691l;
                Object[] objArr = c17893l.f34848l;
                int i = c17893l.f34846l;
                for (int i2 = 0; i2 < i; i2++) {
                    C0840l c0840l = (C0840l) objArr[i2];
                    int i3 = c0840l.crashlytics;
                    int i4 = c0840l.amazon;
                    int i5 = c0840l.yandex;
                    int i6 = c0840l.loadAd;
                    StringBuilder sbSubscription = AbstractC14814l.subscription(i3, i4, "(", ",", ")->(");
                    sbSubscription.append(i5);
                    sbSubscription.append(",");
                    sbSubscription.append(i6);
                    sbSubscription.append(")");
                    sb.append(sbSubscription.toString());
                    if (i2 < ((C17893l) this.f1691l).f34846l - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C6093l m557volatile(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        C1770l c1770l = (C1770l) this.f1690l;
        if (inputConnection == null) {
            c1770l.getClass();
            inputConnection2 = null;
        } else {
            C10023l c10023l = (C10023l) c1770l.f4179l;
            c10023l.getClass();
            if (!(inputConnection instanceof C6093l)) {
                inputConnection = new C6093l((EditText) c10023l.f20419l, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (C6093l) inputConnection2;
    }

    @Override // defpackage.InterfaceC15600l
    public Object yandex(C11425l c11425l, Object obj) {
        return tapsense(c11425l, obj);
    }

    @Override // defpackage.InterfaceC3710l
    public void admob(InterfaceC1286l interfaceC1286l) {
    }

    @Override // defpackage.InterfaceC3710l
    public void subs(InterfaceC1286l interfaceC1286l) {
    }

    public /* synthetic */ C0458l(int i, boolean z) {
        this.f1692l = i;
    }

    public /* synthetic */ C0458l(Object obj, Object obj2, int i) {
        this.f1692l = i;
        this.f1691l = obj;
        this.f1690l = obj2;
    }

    public C0458l(AbstractC0601l abstractC0601l) {
        this.f1692l = 14;
        this.f1691l = abstractC0601l;
        this.f1690l = abstractC0601l;
    }

    public C0458l(C4816l c4816l) {
        this.f1692l = 4;
        this.f1691l = c4816l;
    }

    public C0458l(C3654l c3654l, InterfaceC10835l interfaceC10835l) {
        this.f1692l = 28;
        this.f1691l = c3654l;
        this.f1690l = AbstractC8020l.smaato(interfaceC10835l);
    }

    public C0458l(C0458l c0458l) {
        C17893l c17893l;
        this.f1692l = 11;
        this.f1691l = new C17893l(0, new C0840l[16]);
        this.f1690l = new C17893l(0, new C0840l[16]);
        if (c0458l == null || (c17893l = (C17893l) c0458l.f1691l) == null) {
            return;
        }
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C0840l c0840l = (C0840l) objArr[i2];
            ((C17893l) this.f1691l).crashlytics(new C0840l(c0840l.yandex, c0840l.loadAd, c0840l.crashlytics, c0840l.amazon));
        }
    }

    public C0458l(EditText editText) {
        this.f1692l = 6;
        this.f1691l = editText;
        this.f1690l = new C1770l(editText);
    }

    public C0458l(int i) {
        this.f1692l = i;
        switch (i) {
            case 10:
                this.f1691l = new C5809l();
                this.f1690l = AbstractC1805l.crashlytics(C2580l.f5619l);
                break;
            case 13:
                this.f1691l = new HashMap();
                this.f1690l = new ArrayList();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f1691l = new C13507l(true, 2);
                this.f1690l = new C13507l(true, 2);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f1691l = new int[10];
                this.f1690l = new int[10];
                break;
            case 21:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                this.f1691l = byteArrayOutputStream;
                this.f1690l = new DataOutputStream(byteArrayOutputStream);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f1691l = new HashMap();
                break;
            default:
                this.f1691l = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0458l(Context context) {
        this(context, new C5601l(4));
        this.f1692l = 15;
    }

    public C0458l(Context context, InterfaceC0587l interfaceC0587l) {
        this.f1692l = 15;
        this.f1691l = context.getApplicationContext();
        this.f1690l = interfaceC0587l;
    }

    public C0458l(Function1 function1) {
        this.f1692l = 12;
        this.f1691l = function1;
        this.f1690l = new ConcurrentHashMap();
    }

    public C0458l(C13703l c13703l) {
        this.f1692l = 9;
        this.f1691l = new AbstractC3159l[]{c13703l.loadAd, c13703l.purchase, c13703l.crashlytics};
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f1690l = paint;
    }

    public C0458l(Animator animator) {
        this.f1692l = 24;
        this.f1691l = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1690l = animatorSet;
        animatorSet.play(animator);
    }

    public C0458l(C14000l c14000l) {
        this.f1692l = 16;
        this.f1690l = c14000l;
    }

    public C0458l(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.f1692l = 26;
        this.f1691l = componentName;
        this.f1690l = componentName2;
    }

    public /* synthetic */ C0458l(int i, Object obj) {
        this.f1692l = i;
        this.f1690l = null;
        this.f1691l = obj;
    }
}
