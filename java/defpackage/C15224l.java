package defpackage;

import android.app.Activity;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٔ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15224l {
    public static final C15224l yandex = new C15224l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(Activity activity, boolean z, boolean z2, AbstractC0283l abstractC0283l) {
        C7197l c7197l;
        Object c18435l;
        if (abstractC0283l instanceof C7197l) {
            c7197l = (C7197l) abstractC0283l;
            int i = c7197l.f15034l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7197l.f15034l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7197l = new C7197l(this, abstractC0283l);
            }
        } else {
            c7197l = new C7197l(this, abstractC0283l);
        }
        Object objFirebase = c7197l.f15030l;
        int i2 = c7197l.f15034l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C18160l c18160l = new C18160l(2, interfaceC14029l, 14);
                c7197l.f15033l = activity;
                c7197l.f15032l = z;
                c7197l.f15035l = z2;
                c7197l.f15034l = 1;
                objFirebase = AbstractC10999l.firebase(executorC6708l, c18160l, c7197l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = c7197l.f15035l;
                z = c7197l.f15032l;
                activity = c7197l.f15033l;
                AbstractC2829l.crashlytics(objFirebase);
            }
            c18435l = (C16511l) objFirebase;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (!(c18435l instanceof C18435l)) {
            C16511l c16511l = (C16511l) c18435l;
            if (c16511l.yandex > 100136 || z) {
                new C9135l(c16511l).Signature(activity);
            } else if (z2) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                Toast.makeText(activity, VKXApplication.Companion.loadAd(R.string.ota_none), 0).show();
            }
        }
        if (C1171l.yandex(c18435l) != null && z2) {
            VKXApplication.Companion companion2 = VKXApplication.f36628l;
            Toast.makeText(activity, VKXApplication.Companion.loadAd(R.string.ota_failed), 0).show();
        }
        return Unit.INSTANCE;
    }
}
