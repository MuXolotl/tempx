package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.isPro;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lؖ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4437l implements InterfaceC18325l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9030l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9031l;

    public C4437l(EmojiCompatInitializer emojiCompatInitializer, AbstractC6475l abstractC6475l) {
        this.f9031l = 1;
        this.f9030l = abstractC6475l;
    }

    @Override // defpackage.InterfaceC18325l
    public final void mopub() {
        switch (this.f9031l) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                ((AbstractC12179l) this.f9030l).f24198l.purchase(EnumC14812l.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        int i = this.f9031l;
        Object obj = this.f9030l;
        switch (i) {
            case 0:
                isPro ispro = (isPro) obj;
                AbstractC9859l.yandex();
                ispro.yandex = null;
                ispro.loadAd = null;
                ispro.amazon = null;
                interfaceC3177l.loadAd().loadAd(this);
                break;
            case 1:
            case 2:
                break;
            case 3:
                ArrayDeque arrayDeque = ((C17568l) obj).yandex;
                Iterator it = new ArrayDeque(arrayDeque).iterator();
                while (it.hasNext()) {
                    C17568l.loadAd((C7297l) it.next(), true);
                }
                arrayDeque.clear();
                interfaceC3177l.loadAd().loadAd(this);
                break;
            default:
                ((AbstractC12179l) obj).f24198l.purchase(EnumC14812l.ON_DESTROY);
                interfaceC3177l.loadAd().loadAd(this);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onPause(InterfaceC3177l interfaceC3177l) {
        int i = this.f9031l;
        Object obj = this.f9030l;
        switch (i) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                C7297l c7297l = (C7297l) ((C17568l) obj).yandex.peek();
                if (c7297l != null) {
                    c7297l.crashlytics(EnumC14812l.ON_PAUSE);
                } else {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
                }
                break;
            default:
                ((AbstractC12179l) obj).f24198l.purchase(EnumC14812l.ON_PAUSE);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onResume(InterfaceC3177l interfaceC3177l) {
        int i = this.f9031l;
        Object obj = this.f9030l;
        switch (i) {
            case 0:
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC16239l.yandex(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC10253l(0), 500L);
                ((AbstractC6475l) obj).loadAd(this);
                break;
            case 2:
                break;
            case 3:
                C7297l c7297l = (C7297l) ((C17568l) obj).yandex.peek();
                if (c7297l != null) {
                    c7297l.crashlytics(EnumC14812l.ON_RESUME);
                } else {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
                }
                break;
            default:
                ((AbstractC12179l) obj).f24198l.purchase(EnumC14812l.ON_RESUME);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStart(InterfaceC3177l interfaceC3177l) {
        int i = this.f9031l;
        Object obj = this.f9030l;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                ((C2397l) obj).subs(Unit.INSTANCE);
                break;
            case 3:
                C7297l c7297l = (C7297l) ((C17568l) obj).yandex.peek();
                if (c7297l != null) {
                    c7297l.crashlytics(EnumC14812l.ON_START);
                } else {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
                }
                break;
            default:
                ((AbstractC12179l) obj).f24198l.purchase(EnumC14812l.ON_START);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        int i = this.f9031l;
        Object obj = this.f9030l;
        switch (i) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                C7297l c7297l = (C7297l) ((C17568l) obj).yandex.peek();
                if (c7297l != null) {
                    c7297l.crashlytics(EnumC14812l.ON_STOP);
                } else {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
                }
                break;
            default:
                ((AbstractC12179l) obj).f24198l.purchase(EnumC14812l.ON_STOP);
                break;
        }
    }

    public /* synthetic */ C4437l(int i, Object obj) {
        this.f9031l = i;
        this.f9030l = obj;
    }

    private final void amazon() {
    }

    private final /* synthetic */ void crashlytics() {
    }

    private final /* synthetic */ void loadAd() {
    }

    private final /* synthetic */ void yandex() {
    }

    private final /* synthetic */ void adcel(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void admob(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void billing(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void firebase(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void isPro(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void metrica(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void purchase(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void remoteconfig(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void smaato(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void startapp(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void subs(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void vip(InterfaceC3177l interfaceC3177l) {
    }
}
