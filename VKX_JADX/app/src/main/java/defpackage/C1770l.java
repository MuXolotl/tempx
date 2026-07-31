package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.car.app.model.CarIcon;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1770l implements InterfaceC5457l, InterfaceC1076l, InterfaceC12833l, InterfaceC9762l, InterfaceC12200l, InterfaceC5246l, InterfaceC4930l, InterfaceC15954l, InterfaceC6848l, InterfaceC10466l, InterfaceC15534l, InterfaceC10162l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C1770l f4174l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static volatile C1770l f4175l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f4179l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4180l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1770l f4177l = new C1770l(1, new int[]{1, 2, 4});

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1770l f4176l = new C1770l(1, new int[]{1, 2});

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Object f4178l = new Object();

    public C1770l(int i) {
        this.f4180l = i;
        switch (i) {
            case 2:
                break;
            case 6:
                this.f4179l = new C17893l(0, new C8439l[16]);
                break;
            case 7:
                this.f4179l = new C5008l(28);
                break;
            case 8:
                this.f4179l = new ByteArrayOutputStream();
                break;
            case 13:
                this.f4179l = new C17895l();
                break;
            case 21:
                new C10834l(0);
                this.f4179l = new HashMap();
                break;
            case 23:
                this.f4179l = new C12534l();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f4179l = (ExtraCroppingQuirk) AbstractC17919l.yandex(ExtraCroppingQuirk.class);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f4179l = new C8565l(28);
                break;
            default:
                this.f4179l = new String[]{"Other", "Standard CD album with other songs", "Compressed audio on CD", "File over the Internet", "Stream over the Internet", "As note sheets", "As note sheets in a book with other sheets", "Music on other media", "Non-musical merchandise"};
                break;
        }
    }

    public static C1770l firebase(Context context) {
        C1770l c1770l;
        synchronized (f4178l) {
            try {
                if (f4175l == null) {
                    Context applicationContext = context.getApplicationContext();
                    C1770l c1770l2 = new C1770l(2);
                    C2494l c2494l = new C2494l(6, false);
                    c2494l.f5291l = applicationContext;
                    c2494l.f5290l = applicationContext.getContentResolver();
                    c1770l2.f4179l = c2494l;
                    f4175l = c1770l2;
                }
                c1770l = f4175l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1770l;
    }

    public static C1770l isPro() {
        if (f4174l == null) {
            synchronized (C1770l.class) {
                try {
                    if (f4174l == null) {
                        f4174l = new C1770l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4174l;
    }

    public void Signature(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            C8339l.smaato("Custom icon does not have a backing IconCompat");
            return;
        }
        int iBilling = icon.billing();
        for (int i : (int[]) this.f4179l) {
            if (iBilling == i) {
                if (iBilling != 4 || "content".equalsIgnoreCase(icon.mopub().getScheme())) {
                    return;
                }
                C1759l.ads(icon, "Unsupported URI scheme for: ");
                return;
            }
        }
        C8339l.metrica(AbstractC0653l.vip(iBilling, "Custom icon type is not allowed: "));
    }

    public void adcel(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f4179l;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        ((C12534l) this.f4179l).admob(c9902l, f, c4565l);
        return c9902l;
    }

    public void ads() {
        C17893l c17893l = (C17893l) this.f4179l;
        C8934l c8934lAdcel = AbstractC8576l.adcel(0, c17893l.f34846l);
        int i = c8934lAdcel.f15488l;
        int i2 = c8934lAdcel.f15487l;
        if (i <= i2) {
            while (true) {
                ((C8439l) c17893l.f34848l[i]).loadAd.subs(Unit.INSTANCE);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c17893l.isPro();
    }

    @Override // defpackage.InterfaceC4930l
    public void amazon(Object obj) {
        ((C1090l) this.f4179l).smaato(((C14017l) obj).yandex);
    }

    @Override // defpackage.InterfaceC5246l
    public ListenableFuture apply(Object obj) {
        return AbstractC11356l.mopub(((InterfaceC16004l) this.f4179l).mo1368apply(obj));
    }

    public void billing(CancellationException cancellationException) {
        C17893l c17893l = (C17893l) this.f4179l;
        int i = c17893l.f34846l;
        InterfaceC4305l[] interfaceC4305lArr = new InterfaceC4305l[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4305lArr[i2] = ((C8439l) c17893l.f34848l[i2]).loadAd;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC4305lArr[i3].yandex(cancellationException);
        }
        if (c17893l.f34846l == 0) {
            return;
        }
        AbstractC14825l.crashlytics("uncancelled requests present");
    }

    public void crashlytics(byte[] bArr) {
        try {
            ((ByteArrayOutputStream) this.f4179l).write(bArr);
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C11835l((C8322l) ((InterfaceC15897l) this.f4179l).get());
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = ((String[]) this.f4179l)[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 8;
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f4179l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        C1473l c1473l2 = appBarLayout.getFitsSystemWindows() ? c1473l : null;
        if (!Objects.equals(appBarLayout.f594l, c1473l2)) {
            appBarLayout.f594l = c1473l2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f595l != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c1473l;
    }

    public void loadAd(InterfaceC8635l interfaceC8635l) {
        try {
            ((ByteArrayOutputStream) this.f4179l).write(interfaceC8635l.getEncoded());
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        Exception excSubs = c3823l.subs();
        if (excSubs != null) {
            ((C2397l) this.f4179l).subs(new C18435l(excSubs));
            return;
        }
        boolean z = c3823l.amazon;
        C2397l c2397l = (C2397l) this.f4179l;
        if (z) {
            c2397l.yandex(null);
        } else {
            c2397l.subs(c3823l.isPro());
        }
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
        ((C1090l) this.f4179l).remoteconfig(th);
    }

    @Override // defpackage.InterfaceC12200l
    public C8160l premium(C3624l c3624l) {
        C8160l c8160lPremium;
        InterfaceC4182l interfaceC4182l = (InterfaceC4182l) this.f4179l;
        C2312l c2312l = c3624l.yandex;
        ArrayList<InterfaceC9921l> arrayList = new ArrayList();
        AbstractC15011l.crashlytics(interfaceC4182l, c2312l, arrayList);
        for (InterfaceC9921l interfaceC9921l : arrayList) {
            if ((interfaceC9921l instanceof C8913l) && (c8160lPremium = ((C8913l) interfaceC9921l).f18313l.premium(c3624l)) != null) {
                return c8160lPremium;
            }
        }
        return null;
    }

    public void purchase() {
        ((C3823l) ((C5008l) this.f4179l).f10245l).metrica(null);
    }

    public void remoteconfig() {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f4179l;
            if (i >= c10111lArr.length) {
                return;
            }
            c10111lArr[i].signatures();
            i++;
        }
    }

    public boolean smaato(C16701l c16701l) {
        C2494l c2494l = (C2494l) this.f4179l;
        C14996l c14996l = c16701l.yandex;
        Context context = (Context) c2494l.f5291l;
        int i = c14996l.crashlytics;
        String str = c14996l.yandex;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i2 < 28) {
                    i = applicationInfo.uid;
                }
                if (i == 1000 || i == Process.myUid() || context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", c14996l.loadAd, c14996l.crashlytics) == 0 || c2494l.m1184l(c14996l, "android.permission.STATUS_BAR_SERVICE") || c2494l.m1184l(c14996l, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) c2494l.f5290l, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC6427l.billing("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    @Override // defpackage.InterfaceC9762l
    public void startapp(Bundle bundle) {
        ((C18110l) ((InterfaceC6235l) this.f4179l)).yandex("clx", "_ae", bundle);
    }

    public void subs(C1770l c1770l) {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f4179l;
            if (i >= c10111lArr.length) {
                return;
            }
            System.arraycopy((int[]) c10111lArr[i].f20587l, 0, (int[]) ((C10111l[]) c1770l.f4179l)[i].f20587l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            i++;
        }
    }

    public void subscription(C0847l c0847l, Function1 function1) {
        C6337l c6337l = new C6337l(function1);
        C8029l c8029l = (C8029l) ((C17895l) this.f4179l).yandex(c0847l, new C4741l(23));
        while (true) {
            Object obj = c8029l._prev;
            if (!(obj instanceof C4760l)) {
                C8327l c8327l = (C8327l) obj;
                if (c8327l._next != c8029l) {
                    c8029l.loadAd(c8327l);
                }
            }
            C8327l c8327l2 = (C8327l) obj;
            c8327l2.getClass();
            C8327l.f17221l.lazySet(c6337l, c8327l2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8327l.f17222l;
            atomicReferenceFieldUpdater.lazySet(c6337l, c8029l);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c8327l2, c8029l, c6337l)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(c8327l2) == c8029l);
        }
        while (true) {
            Object obj2 = c8029l._prev;
            if ((obj2 instanceof C4760l) || c6337l._next != c8029l) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C8327l.f17221l;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c8029l, obj2, c6337l)) {
                    if (c6337l._next instanceof C4760l) {
                        c8029l.loadAd((C8327l) obj2);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(c8029l) == obj2);
        }
    }

    public void tapsense(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f4179l;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public String toString() {
        switch (this.f4180l) {
            case 22:
                C10111l[] c10111lArr = (C10111l[]) this.f4179l;
                String strConcat = "\n[";
                for (int i = 0; i < c10111lArr.length; i++) {
                    strConcat = strConcat + "Inner Matrix " + i + " " + c10111lArr[i].toString();
                    if (i != c10111lArr.length - 1) {
                        strConcat = strConcat.concat(",\n");
                    }
                }
                return strConcat.concat("]");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1076l
    /* JADX INFO: renamed from: try */
    public boolean mo248try(MenuC4984l menuC4984l) {
        C0791l c0791l = (C0791l) this.f4179l;
        if (menuC4984l == c0791l.f2386l) {
            return false;
        }
        ((SubMenuC3166l) menuC4984l).f6800l.getClass();
        InterfaceC1076l interfaceC1076l = c0791l.f2398l;
        if (interfaceC1076l != null) {
            return interfaceC1076l.mo248try(menuC4984l);
        }
        return false;
    }

    public void vip(C0847l c0847l, Object obj) throws Throwable {
        C8029l c8029l = (C8029l) ((C17895l) this.f4179l).loadAd(c0847l);
        Throwable th = null;
        if (c8029l != null) {
            for (C8327l c8327lRemoteconfig = (C8327l) c8029l._next; !AbstractC8576l.yandex(c8327lRemoteconfig, c8029l); c8327lRemoteconfig = AbstractC2632l.remoteconfig(c8327lRemoteconfig._next)) {
                if (c8327lRemoteconfig instanceof C6337l) {
                    try {
                        Function1 function1 = ((C6337l) c8327lRemoteconfig).f13289l;
                        AbstractC9464l.purchase(1, function1);
                        function1.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC11718l.yandex(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1076l
    public void yandex(MenuC4984l menuC4984l, boolean z) {
        if (menuC4984l instanceof SubMenuC3166l) {
            ((SubMenuC3166l) menuC4984l).f6801l.firebase().crashlytics(false);
        }
        InterfaceC1076l interfaceC1076l = ((C0791l) this.f4179l).f2398l;
        if (interfaceC1076l != null) {
            interfaceC1076l.yandex(menuC4984l, z);
        }
    }

    public C1770l(C5775l c5775l) {
        this.f4180l = 22;
        int i = c5775l.mopub;
        this.f4179l = new C10111l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C10111l[]) this.f4179l)[i2] = new C10111l(c5775l);
        }
    }

    public C1770l(View view) {
        this.f4180l = 27;
        if (Build.VERSION.SDK_INT >= 30) {
            C8476l c8476l = new C8476l(27, view);
            c8476l.f17519l = view;
            this.f4179l = c8476l;
            return;
        }
        this.f4179l = new C3585l(27, view);
    }

    public /* synthetic */ C1770l(int i, Object obj) {
        this.f4180l = i;
        this.f4179l = obj;
    }

    public C1770l(EditText editText) {
        this.f4180l = 12;
        C10023l c10023l = new C10023l();
        c10023l.f20419l = editText;
        C13491l c13491l = new C13491l(editText);
        c10023l.f20418l = c13491l;
        editText.addTextChangedListener(c13491l);
        if (C12142l.loadAd == null) {
            synchronized (C12142l.yandex) {
                try {
                    if (C12142l.loadAd == null) {
                        C12142l c12142l = new C12142l();
                        try {
                            C12142l.crashlytics = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C12142l.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C12142l.loadAd = c12142l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(C12142l.loadAd);
        this.f4179l = c10023l;
    }
}
