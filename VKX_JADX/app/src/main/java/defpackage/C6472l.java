package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙٔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6472l implements InterfaceC10466l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f13509l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13510l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f13511l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f13512l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13513l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13514l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f13515l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f13516l;

    public C6472l(Context context) {
        this.f13513l = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f13514l = layoutParams;
        this.f13516l = new Rect();
        this.f13510l = new int[2];
        this.f13511l = new int[2];
        this.f13512l = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f13509l = viewInflate;
        this.f13515l = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C6472l.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void crashlytics(String str) {
        C11919l c11919l = (C11919l) this.f13516l;
        synchronized (c11919l) {
            try {
                if (((C11787l) ((AtomicMarkableReference) c11919l.f23763l).getReference()).crashlytics(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c11919l.f23763l;
                    atomicMarkableReference.set((C11787l) atomicMarkableReference.getReference(), true);
                    RunnableC6665l runnableC6665l = new RunnableC6665l(14, c11919l);
                    AtomicReference atomicReference = (AtomicReference) c11919l.f23767l;
                    while (!atomicReference.compareAndSet(null, runnableC6665l)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ExecutorC4850l) ((C0554l) ((C6472l) c11919l.f23766l).f13509l).f1957l).yandex(runnableC6665l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C14567l((C8137l) ((InterfaceC15897l) this.f13512l).get(), (C8322l) ((InterfaceC15897l) this.f13509l).get(), (C17395l) ((InterfaceC15897l) this.f13515l).get(), (C3982l) ((InterfaceC15897l) this.f13514l).get(), (InterfaceC15829l) ((InterfaceC15897l) this.f13516l).get(), (C4288l) ((InterfaceC2661l) this.f13510l).get(), (InterfaceC12932l) ((InterfaceC15897l) this.f13511l).get());
    }

    public Object loadAd() {
        Map map = (Map) ((C17535l) this.f13510l).billing(AbstractC14044l.yandex);
        if (map != null) {
            return map.get(C10837l.yandex);
        }
        return null;
    }

    public String toString() {
        switch (this.f13513l) {
            case 2:
                return "HttpRequestData(url=" + ((C2540l) this.f13512l) + ", method=" + ((C17721l) this.f13509l) + ')';
            default:
                return super.toString();
        }
    }

    public C5464l yandex() {
        String strConcat = ((Size) this.f13512l) == null ? " resolution" : "";
        if (((Size) this.f13509l) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((C15421l) this.f13515l) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.f13514l) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.f13516l) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.f13511l) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new C5464l((Size) this.f13512l, (Size) this.f13509l, (C15421l) this.f13515l, ((Integer) this.f13514l).intValue(), (Range) this.f13516l, (InterfaceC17944l) this.f13510l, ((Boolean) this.f13511l).booleanValue());
        }
        C8339l.smaato("Missing required properties:".concat(strConcat));
        return null;
    }

    public C6472l(InterfaceC2661l interfaceC2661l, InterfaceC2661l interfaceC2661l2, InterfaceC2661l interfaceC2661l3, InterfaceC2661l interfaceC2661l4, InterfaceC2661l interfaceC2661l5, InterfaceC2661l interfaceC2661l6, C14461l c14461l) {
        this.f13513l = 3;
        this.f13512l = interfaceC2661l;
        this.f13509l = interfaceC2661l2;
        this.f13515l = interfaceC2661l3;
        this.f13514l = interfaceC2661l4;
        this.f13516l = interfaceC2661l5;
        this.f13510l = interfaceC2661l6;
        this.f13511l = c14461l;
    }

    public /* synthetic */ C6472l(int i) {
        this.f13513l = i;
    }

    public C6472l(String str, C12714l c12714l, C0554l c0554l) {
        this.f13513l = 4;
        this.f13514l = new C11919l(this, false);
        this.f13516l = new C11919l(this, true);
        this.f13510l = new C7375l(2);
        this.f13511l = new AtomicMarkableReference(null, false);
        this.f13515l = str;
        this.f13512l = new C16532l(c12714l);
        this.f13509l = c0554l;
    }

    public C6472l(C2540l c2540l, C17721l c17721l, C3223l c3223l, AbstractC8870l abstractC8870l, InterfaceC7042l interfaceC7042l, C17535l c17535l) {
        Object objKeySet;
        this.f13513l = 2;
        this.f13512l = c2540l;
        this.f13509l = c17721l;
        this.f13515l = c3223l;
        this.f13514l = abstractC8870l;
        this.f13516l = interfaceC7042l;
        this.f13510l = c17535l;
        Map map = (Map) c17535l.billing(AbstractC14044l.yandex);
        this.f13511l = (map == null || (objKeySet = map.keySet()) == null) ? C5746l.f12138l : objKeySet;
    }
}
