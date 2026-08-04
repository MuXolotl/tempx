package defpackage;

import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؑۗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0532l {
    public static final C15578l yandex = new C15578l(1358969708, false, new C2834l(29));
    public static final C15578l loadAd = new C15578l(1705045675, false, new C14484l(0));
    public static final C15578l crashlytics = new C15578l(-322667659, false, new C14484l(1));
    public static final C15578l amazon = new C15578l(397491588, false, new C11112l(13));

    public static C13315l admob(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C13315l(f, f2, obj);
    }

    public static final Object amazon(C15106l c15106l, C16543l c16543l) {
        Object obj = c15106l.isPro.yandex.get(c16543l);
        return obj == null ? c16543l.f32482l : obj;
    }

    public static final C13591l billing(Function1 function1) {
        C10942l c10942l = new C10942l();
        function1.invoke(c10942l);
        return new C13591l(c10942l);
    }

    public static final Object crashlytics(C7819l c7819l, C16543l c16543l) {
        Object obj = c7819l.Signature.yandex.get(c16543l);
        if (obj != null) {
            return obj;
        }
        Object obj2 = c7819l.pro.vip.yandex.get(c16543l);
        return obj2 == null ? c16543l.f32482l : obj2;
    }

    public static void loadAd(Function0 function0, AppActivity appActivity) {
        if (appActivity == null) {
            function0.invoke();
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            function0.invoke();
            return;
        }
        List<String> listSingletonList = Collections.singletonList("android.permission.POST_NOTIFICATIONS");
        C10776l c10776l = new C10776l(function0, appActivity);
        int i = appActivity.f5598l;
        appActivity.f5598l = i + 1;
        appActivity.f5600l.put(i, c10776l);
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            if (appActivity.checkPermission((String) it.next(), Process.myPid(), Process.myUid()) != 0) {
                appActivity.requestPermissions((String[]) listSingletonList.toArray(new String[0]), i);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listSingletonList) {
            arrayList.add(new C12041l(0));
        }
        C12041l c12041l = (C12041l) AbstractC16901l.m4217extends(arrayList);
        if (c12041l == null || c12041l.yandex != 0) {
            new C7217l().Signature(c10776l.loadAd);
        } else {
            c10776l.yandex.invoke();
        }
    }

    public static C2966l mopub() {
        return new C2966l(0);
    }

    public static C4165l purchase(InterfaceC14206l interfaceC14206l, int i, long j, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return new C4165l(interfaceC14206l, i, j);
    }

    public static C4776l subs(int i, int i2, InterfaceC8097l interfaceC8097l) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            interfaceC8097l = AbstractC5341l.yandex;
        }
        return new C4776l(i, i3, interfaceC8097l);
    }

    public static final boolean yandex(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC16422l.amazon(keyEvent) >> 32)) == i;
    }
}
