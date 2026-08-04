package ua.itaysonlab.vkxreborn.playback.service;

import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.session.MediaLibraryService;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0622l;
import defpackage.AbstractC10586l;
import defpackage.AbstractC1058l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11738l;
import defpackage.AbstractC1186l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC1213l;
import defpackage.AbstractC12148l;
import defpackage.AbstractC1214l;
import defpackage.AbstractC12442l;
import defpackage.AbstractC12832l;
import defpackage.AbstractC1295l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC15323l;
import defpackage.AbstractC17265l;
import defpackage.AbstractC17278l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC2829l;
import defpackage.AbstractC2991l;
import defpackage.AbstractC6025l;
import defpackage.AbstractC6475l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8619l;
import defpackage.AbstractC8669l;
import defpackage.AbstractC9079l;
import defpackage.C0059l;
import defpackage.C0071l;
import defpackage.C0307l;
import defpackage.C0554l;
import defpackage.C10227l;
import defpackage.C10507l;
import defpackage.C1080l;
import defpackage.C10995l;
import defpackage.C1100l;
import defpackage.C11287l;
import defpackage.C11644l;
import defpackage.C12014l;
import defpackage.C12023l;
import defpackage.C12417l;
import defpackage.C12418l;
import defpackage.C13042l;
import defpackage.C13140l;
import defpackage.C13572l;
import defpackage.C13967l;
import defpackage.C14300l;
import defpackage.C14427l;
import defpackage.C14500l;
import defpackage.C14785l;
import defpackage.C14863l;
import defpackage.C15035l;
import defpackage.C15406l;
import defpackage.C15417l;
import defpackage.C15926l;
import defpackage.C16076l;
import defpackage.C16552l;
import defpackage.C16811l;
import defpackage.C16959l;
import defpackage.C17070l;
import defpackage.C17218l;
import defpackage.C1725l;
import defpackage.C17505l;
import defpackage.C17528l;
import defpackage.C17787l;
import defpackage.C17804l;
import defpackage.C18200l;
import defpackage.C18317l;
import defpackage.C1847l;
import defpackage.C18606l;
import defpackage.C18662l;
import defpackage.C18725l;
import defpackage.C2205l;
import defpackage.C2258l;
import defpackage.C2347l;
import defpackage.C2494l;
import defpackage.C2580l;
import defpackage.C2975l;
import defpackage.C2993l;
import defpackage.C3342l;
import defpackage.C3726l;
import defpackage.C3797l;
import defpackage.C3915l;
import defpackage.C4236l;
import defpackage.C4936l;
import defpackage.C5075l;
import defpackage.C5268l;
import defpackage.C5610l;
import defpackage.C5888l;
import defpackage.C6209l;
import defpackage.C6499l;
import defpackage.C7226l;
import defpackage.C7864l;
import defpackage.C8084l;
import defpackage.C8122l;
import defpackage.C8214l;
import defpackage.C8250l;
import defpackage.C8339l;
import defpackage.C8490l;
import defpackage.C8688l;
import defpackage.C8934l;
import defpackage.C9329l;
import defpackage.C9871l;
import defpackage.C9896l;
import defpackage.C9928l;
import defpackage.EnumC10870l;
import defpackage.EnumC12501l;
import defpackage.EnumC14812l;
import defpackage.EnumC8981l;
import defpackage.EnumC9342l;
import defpackage.ExecutorC6708l;
import defpackage.InterfaceC1246l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC14762l;
import defpackage.InterfaceC17205l;
import defpackage.InterfaceC17817l;
import defpackage.InterfaceC3604l;
import defpackage.InterfaceC6019l;
import defpackage.InterfaceC9474l;
import defpackage.InterfaceC9764l;
import defpackage.InterfaceC9814l;
import defpackage.RunnableC12388l;
import defpackage.RunnableC5360l;
import defpackage.RunnableC7762l;
import defpackage.appmetrica;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackService extends MediaLibraryService implements Handler.Callback {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f36828l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C15035l f36829l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C18662l f36830l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C8688l f36831l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C8688l f36832l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C10995l f36833l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C15926l[] f36834l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C8688l f36835l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f36836l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Handler f36837l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C11644l f36838l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C2993l f36839l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C12418l f36840l = new C12418l(this);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public RunnableC5360l f36841l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C0307l f36842l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public List f36843l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C13572l f36844l;

    public PlaybackService() {
        Looper mainLooper = Looper.getMainLooper();
        String str = AbstractC15323l.yandex;
        this.f36837l = new Handler(mainLooper, this);
        C2993l c2993lCrashlytics = AbstractC1295l.crashlytics();
        this.f36839l = c2993lCrashlytics;
        C16552l c16552l = AbstractC11463l.yandex;
        C2975l c2975l = AbstractC17278l.yandex;
        c2975l.getClass();
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(c2975l, c2993lCrashlytics));
        this.f36830l = c18662lYandex;
        this.f36833l = new C10995l(this);
        this.f36836l = new C8688l(new C17070l(this, 2));
        this.f36843l = C2580l.f5619l;
        this.f36835l = new C8688l(new C17070l(this, 3));
        this.f36832l = new C8688l(new C17070l(this, 4));
        this.f36831l = new C8688l(new C17070l(this, 5));
        int i = 0;
        int i2 = 0;
        this.f36829l = new C15035l(c18662lYandex, new C0059l(0, 10, PlaybackService.class, this, "playbackController", "getPlaybackController()Lua/itaysonlab/vkxreborn/playback/PlaybackControllerImpl;"), new C0059l(0, 11, PlaybackService.class, this, "playlistHolder", "getPlaylistHolder()Lua/itaysonlab/vkxreborn/playback/service/AppPlaylistHolder;"), new C18200l(0, 1, PlaybackService.class, this, "customLayout", "getCustomLayout()Ljava/util/List;"), new C15406l(1, this, PlaybackService.class, "updateLayout", "updateLayout(Ljava/lang/Boolean;)V", i2, i, 27), new C4236l(3, this, PlaybackService.class, "onCustomCommand", "onCustomCommand(Landroidx/media3/session/SessionCommand;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, i, 13), new C15406l(1, this, PlaybackService.class, "onPlaybackResumption", "onPlaybackResumption(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, i, 28), new C17528l(5, license().f31514l, InterfaceC3604l.class, "search", "search(Ljava/lang/String;IILandroidx/media3/session/MediaLibraryService$LibraryParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0));
        this.f36834l = new C15926l[2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object adcel(PlaybackService playbackService, InterfaceC14029l interfaceC14029l) {
        C17787l c17787l;
        C18662l c18662l = playbackService.f36830l;
        if (interfaceC14029l instanceof C17787l) {
            c17787l = (C17787l) interfaceC14029l;
            int i = c17787l.f34650l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17787l.f34650l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17787l = new C17787l(playbackService, interfaceC14029l);
            }
        } else {
            c17787l = new C17787l(playbackService, interfaceC14029l);
        }
        Object objFirebase = c17787l.f34649l;
        int i2 = c17787l.f34650l;
        int i3 = 3;
        InterfaceC14029l interfaceC14029l2 = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                playbackService.Signature().crashlytics = true;
                C13572l c13572l = playbackService.f36844l;
                if (c13572l == null) {
                    c13572l = null;
                }
                playbackService.isPro(c13572l, true);
                InterfaceC17205l interfaceC17205l = license().f31501l;
                c17787l.f34650l = 1;
                ((C13042l) interfaceC17205l).getClass();
                objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C15417l(2, interfaceC14029l2), c17787l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objFirebase);
            }
            C9896l c9896l = (C9896l) objFirebase;
            AbstractC10999l.mopub(c18662l, null, 0, new C16959l(playbackService, interfaceC14029l2, i3), 3);
            return c9896l;
        } catch (Throwable th) {
            AbstractC10999l.mopub(c18662l, null, 0, new C16959l(playbackService, interfaceC14029l2, i3), 3);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void ads(PlaybackService playbackService, InterfaceC9814l interfaceC9814l) {
        playbackService.getClass();
        C18662l c18662l = playbackService.f36830l;
        try {
            C0307l c0307l = playbackService.f36842l;
            C0307l c0307l2 = null;
            byte b = 0;
            if (c0307l == null) {
                c0307l = null;
            }
            c0307l.subs = false;
            C10507l c10507lAdmob = license().f31521l.admob(Integer.valueOf(interfaceC9814l.mo2761implements()));
            if (c10507lAdmob == null) {
                return;
            }
            AbstractC18643l abstractC18643l = c10507lAdmob.loadAd;
            InterfaceC6019l interfaceC6019l = abstractC18643l instanceof InterfaceC6019l ? (InterfaceC6019l) abstractC18643l : null;
            if (interfaceC6019l != null && interfaceC6019l.yandex()) {
                interfaceC9814l.mo2760goto();
                return;
            }
            C10507l c10507lAdmob2 = license().f31521l.admob(Integer.valueOf(interfaceC9814l.license()));
            AbstractC18643l abstractC18643l2 = c10507lAdmob2 != null ? c10507lAdmob2.loadAd : null;
            C10507l c10507lAdmob3 = license().f31521l.admob(Integer.valueOf(interfaceC9814l.mo2813try()));
            AbstractC18643l abstractC18643l3 = c10507lAdmob3 != null ? c10507lAdmob3.loadAd : null;
            if (((Boolean) AbstractC8619l.firebase.yandex()).booleanValue()) {
                license().f31515l.yandex(abstractC18643l);
            }
            Iterator it = license().f31510l.iterator();
            while (it.hasNext()) {
                ((InterfaceC14762l) it.next()).yandex(abstractC18643l, abstractC18643l2);
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC9764l interfaceC9764l = abstractC18643l instanceof InterfaceC9764l ? (InterfaceC9764l) abstractC18643l : null;
            playbackService.signatures(interfaceC9764l != null ? Boolean.valueOf(interfaceC9764l.getBilling()) : null);
            int iMo2792l = interfaceC9814l.mo2792l();
            int i = iMo2792l - 1;
            int i2 = iMo2792l - 6;
            int i3 = new C8934l(i2, i, 1).f15487l;
            int iMo2761implements = interfaceC9814l.mo2761implements();
            if (i2 <= iMo2761implements && iMo2761implements <= i3 && interfaceC9814l.purchase() != 1) {
                AbstractC10999l.mopub(c18662l, null, 0, new C16959l(playbackService, b == true ? 1 : 0, 8), 3);
            }
            C0307l c0307l3 = playbackService.f36842l;
            if (c0307l3 != null) {
                c0307l2 = c0307l3;
            }
            c0307l2.loadAd(new C5610l(abstractC18643l, 2));
            AbstractC12832l.mopub(new C1725l(c10507lAdmob, abstractC18643l2, abstractC18643l3, interfaceC9814l.mo2761implements()), c18662l);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static C16076l license() {
        C0554l c0554l = C16076l.f31498l;
        if (c0554l == null) {
            c0554l = null;
        }
        return (C16076l) ((C3342l) c0554l.f1958l).invoke();
    }

    public final C14863l Signature() {
        return (C14863l) this.f36836l.getValue();
    }

    public final void ad() {
        this.f36840l.ad(EnumC14812l.ON_CREATE);
        super.onCreate();
    }

    public final void advert() {
        EnumC14812l enumC14812l = EnumC14812l.ON_STOP;
        C12418l c12418l = this.f36840l;
        c12418l.ad(enumC14812l);
        c12418l.ad(EnumC14812l.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        AbstractC10999l.mopub(this.f36830l, null, 0, new C16959l(this, null, 6), 3);
        this.f36837l.sendEmptyMessageDelayed(1, 60000L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    public final void isVip() {
        long duration;
        C11644l c11644l = this.f36838l;
        if (c11644l == null) {
            c11644l = null;
        }
        long jMo2771l = ((InterfaceC9814l) ((C9928l) c11644l.f23358l).f33215l).mo2771l();
        Iterator it = license().f31510l.iterator();
        while (it.hasNext()) {
            ((InterfaceC14762l) it.next()).crashlytics(jMo2771l);
            Unit unit = Unit.INSTANCE;
        }
        if (license().f31504l) {
            C11644l c11644l2 = this.f36838l;
            if (c11644l2 == null) {
                c11644l2 = null;
            }
            long jMo2798new = ((InterfaceC9814l) ((C9928l) c11644l2.f23358l).f33215l).mo2798new();
            C11644l c11644l3 = this.f36838l;
            if (c11644l3 == null) {
                c11644l3 = null;
            }
            long duration2 = ((InterfaceC9814l) ((C9928l) c11644l3.f23358l).f33215l).getDuration();
            AbstractC12832l.mopub(new C5075l(new C1100l(duration2 < 0 ? 0L : duration2, jMo2798new, jMo2771l)), this.f36830l);
        }
        C0307l c0307l = this.f36842l;
        C0307l c0307l2 = c0307l != null ? c0307l : null;
        boolean z = c0307l2.billing;
        C9928l c9928l = c0307l2.crashlytics;
        C9928l c9928l2 = c0307l2.loadAd;
        if (z) {
            InterfaceC9814l interfaceC9814l = (InterfaceC9814l) c0307l2.yandex().f33215l;
            InterfaceC9814l interfaceC9814l2 = (InterfaceC9814l) c0307l2.yandex().f33215l;
            if (c0307l2.subs || interfaceC9814l2.mopub() == 1 || !interfaceC9814l2.mo2763instanceof() || interfaceC9814l2.getDuration() == -9223372036854775807L || interfaceC9814l2.mo2771l() == -9223372036854775807L) {
                InterfaceC9814l interfaceC9814l3 = (InterfaceC9814l) c0307l2.yandex().f33215l;
                if (!c0307l2.isPro && c0307l2.subs && interfaceC9814l3.mopub() != 1 && interfaceC9814l3.mo2763instanceof() && interfaceC9814l3.getDuration() != -9223372036854775807L && interfaceC9814l3.mo2771l() != -9223372036854775807L && interfaceC9814l3.getDuration() - interfaceC9814l3.mo2771l() <= c0307l2.mopub) {
                    duration = interfaceC9814l.getDuration() - interfaceC9814l.mo2771l();
                    if (duration < 0) {
                        duration = 0;
                    }
                    C9928l c9928lYandex = c0307l2.yandex();
                    InterfaceC9814l interfaceC9814l4 = (InterfaceC9814l) c9928lYandex.f33215l;
                    if (c0307l2.purchase) {
                        c9928l = c9928l2;
                    }
                    c0307l2.isPro = true;
                    c9928l.loadAd(interfaceC9814l4.billing());
                    c9928lYandex.mo2748break(interfaceC9814l4.applovin(), false);
                    c9928l.mo2748break(((InterfaceC9814l) c9928l.f33215l).applovin(), !((Boolean) AbstractC8619l.subs.yandex()).booleanValue());
                    c9928l.mo2755else(0.0f);
                    c9928l.mo2753continue(true);
                    ValueAnimator valueAnimator = c0307l2.admob;
                    valueAnimator.setCurrentPlayTime(0L);
                    valueAnimator.setDuration(duration);
                    valueAnimator.addUpdateListener(new C14427l(c9928lYandex, c9928l, 2));
                    valueAnimator.addListener(c0307l2.firebase);
                    valueAnimator.start();
                }
            } else {
                long duration3 = interfaceC9814l2.getDuration() - interfaceC9814l2.mo2771l();
                long j = c0307l2.mopub * 2;
                if (j < 30000) {
                    j = 30000;
                }
                if (duration3 <= j) {
                    C9928l c9928lYandex2 = c0307l2.yandex();
                    if (c0307l2.purchase) {
                        c9928l = c9928l2;
                    }
                    c0307l2.subs = true;
                    C11644l c11644l4 = c0307l2.yandex;
                    int iMo2813try = ((InterfaceC9814l) c9928lYandex2.f33215l).mo2813try();
                    ArrayList arrayList = (ArrayList) c11644l4.f23362l;
                    c9928l.mo2752const(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).mopub());
                    c9928l.ads(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).mo2788l());
                    c9928l.mo2812transient(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).mo2802public());
                    c9928l.mo2800private(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).mo2766l());
                    c9928l.mo2755else(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).signatures());
                    c9928l.mo2748break(((InterfaceC9814l) ((C9928l) c11644l4.f23358l).f33215l).applovin(), true);
                    c9928l.mo2753continue(false);
                    c9928l.mo2781l(iMo2813try, 0L, arrayList);
                    c9928l.yandex();
                    c11644l4.f23360l = c9928l;
                } else {
                    InterfaceC9814l interfaceC9814l5 = (InterfaceC9814l) c0307l2.yandex().f33215l;
                    if (!c0307l2.isPro) {
                        duration = interfaceC9814l.getDuration() - interfaceC9814l.mo2771l();
                        if (duration < 0) {
                            duration = 0;
                        }
                        C9928l c9928lYandex3 = c0307l2.yandex();
                        InterfaceC9814l interfaceC9814l6 = (InterfaceC9814l) c9928lYandex3.f33215l;
                        if (c0307l2.purchase) {
                            c9928l = c9928l2;
                        }
                        c0307l2.isPro = true;
                        c9928l.loadAd(interfaceC9814l6.billing());
                        c9928lYandex3.mo2748break(interfaceC9814l6.applovin(), false);
                        c9928l.mo2748break(((InterfaceC9814l) c9928l.f33215l).applovin(), !((Boolean) AbstractC8619l.subs.yandex()).booleanValue());
                        c9928l.mo2755else(0.0f);
                        c9928l.mo2753continue(true);
                        ValueAnimator valueAnimator2 = c0307l2.admob;
                        valueAnimator2.setCurrentPlayTime(0L);
                        valueAnimator2.setDuration(duration);
                        valueAnimator2.addUpdateListener(new C14427l(c9928lYandex3, c9928l, 2));
                        valueAnimator2.addListener(c0307l2.firebase);
                        valueAnimator2.start();
                    }
                }
            }
        }
        RunnableC5360l runnableC5360l = new RunnableC5360l(18, this);
        this.f36837l.postDelayed(runnableC5360l, 1000L);
        this.f36841l = runnableC5360l;
    }

    @Override // defpackage.AbstractServiceC4696l, defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return (C5268l) this.f36840l.f24519l;
    }

    @Override // androidx.media3.session.MediaLibraryService, defpackage.AbstractServiceC3639l, defpackage.AbstractServiceC4696l, android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f36840l.ad(EnumC14812l.ON_START);
        return super.onBind(intent);
    }

    @Override // defpackage.AbstractServiceC3639l, defpackage.AbstractServiceC4696l, android.app.Service
    public final void onCreate() {
        int i;
        C13140l c13140lPro;
        Object obj;
        Method method;
        ad();
        C9928l c9928lSubscription = subscription();
        C9928l c9928lSubscription2 = subscription();
        Context applicationContext = getApplicationContext();
        InterfaceC1246l interfaceC1246l = license().f31516l;
        C17070l c17070l = new C17070l(this, 0);
        C18662l c18662l = this.f36830l;
        C15926l c15926l = new C15926l(c9928lSubscription, applicationContext, c18662l, interfaceC1246l, c17070l);
        C15926l[] c15926lArr = this.f36834l;
        c15926lArr[0] = c15926l;
        c15926lArr[1] = new C15926l(c9928lSubscription2, getApplicationContext(), c18662l, license().f31516l, new C17070l(this, 1));
        Iterator it = AbstractC8669l.m2420volatile(c15926lArr).iterator();
        while (it.hasNext()) {
            ((C15926l) it.next()).crashlytics();
        }
        C11644l c11644l = new C11644l(c9928lSubscription);
        this.f36838l = c11644l;
        c11644l.Signature(this.f36833l);
        C11644l c11644l2 = this.f36838l;
        C0307l c0307l = new C0307l(c11644l2 == null ? null : c11644l2, c9928lSubscription, c9928lSubscription2, new C3342l(5), new C4936l(0, this, PlaybackService.class, "onCrossfadeFinish", "onCrossfadeFinish()V", 0, 0, 14));
        this.f36842l = c0307l;
        C11644l c11644l3 = this.f36838l;
        if (c11644l3 == null) {
            c11644l3 = null;
        }
        c11644l3.f23357l = new C4936l(0, c0307l, C0307l.class, "onReset", "onReset$orbitplayback()V", 0, 0, 15);
        C11644l c11644l4 = this.f36838l;
        if (c11644l4 == null) {
            c11644l4 = null;
        }
        C8214l c8214l = new C8214l(this, c11644l4, this.f36829l);
        C0554l c0554l = C16076l.f31498l;
        if (c0554l == null) {
            c0554l = null;
        }
        PendingIntent pendingIntent = (PendingIntent) ((C9871l) c0554l.f1957l).invoke();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            AbstractC12442l.admob(AbstractC12148l.Signature(pendingIntent));
        }
        c8214l.purchase = pendingIntent;
        c8214l.admob = new C3797l(new C12014l(getApplicationContext(), c18662l, new C15406l(1, license().f31521l, C2258l.class, "playbackItemByContentId", "playbackItemByContentId(Ljava/lang/String;)Lbruhcollective/itaysonlab/playback/PlaybackItem;", 0, 0, 26)));
        AbstractC12442l.subscription(!c8214l.metrica);
        c8214l.metrica = true;
        Object obj2 = C13572l.loadAd;
        int iIntValue = ((Integer) C3726l.f7783native.get()).intValue();
        Context context = c8214l.yandex;
        if (i2 < 27) {
            iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        InterfaceC9474l interfaceC9474l = c8214l.admob;
        if (interfaceC9474l == null) {
            appmetrica appmetricaVar = new appmetrica(context);
            appmetricaVar.f489l = iIntValue;
            appmetricaVar.f490l = true;
            c8214l.admob = new C2205l(appmetricaVar);
        } else {
            c8214l.admob = new C14785l(interfaceC9474l, iIntValue, 22);
        }
        if (i2 == 29) {
            InterfaceC9474l interfaceC9474l2 = c8214l.admob;
            AtomicReference atomicReference = C8214l.startapp;
            C13967l c13967l = (C13967l) atomicReference.get();
            if (c13967l != null) {
                i = 6;
            } else {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i3 = point2.y;
                int i4 = point2.x;
                i = 6;
                Point point3 = new Point(i3 - (i4 - point.x), i4 - (i3 - point.y));
                c13967l = new C13967l(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                atomicReference.set(c13967l);
            }
            c8214l.admob = new C2494l(interfaceC9474l2, c13967l, 21);
        } else {
            i = 6;
        }
        c8214l.admob = new C3797l(c8214l.admob);
        this.f36844l = new C13572l(c8214l.yandex, c8214l.crashlytics, c8214l.loadAd, c8214l.purchase, c8214l.isPro, c8214l.firebase, c8214l.smaato, c8214l.amazon, c8214l.billing, c8214l.mopub, c8214l.admob, c8214l.subs, c8214l.remoteconfig, c8214l.vip);
        InterfaceC14029l interfaceC14029l = null;
        C9329l c9329l = new C9329l(this, interfaceC14029l, 0);
        C8490l c8490l = AbstractC6025l.yandex;
        C12418l c12418l = this.f36840l;
        C5268l c5268l = (C5268l) c12418l.f24519l;
        C8084l c8084l = AbstractC6025l.loadAd;
        int i5 = 1;
        int i6 = 2;
        C2347l c2347l = new C2347l(new C14300l(c8084l, i5), new C5888l(c9329l, interfaceC14029l, 27), 2);
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        C9329l c9329l2 = new C9329l(this, interfaceC14029l, i5);
        C5268l c5268l2 = (C5268l) c12418l.f24519l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C14300l(c8084l, i6), new C5888l(c9329l2, interfaceC14029l, 29), 2), c5268l2, enumC8981l), AbstractC11738l.yandex(c5268l2));
        C7864l c7864l = new C7864l(this, interfaceC14029l, 9);
        C5268l c5268l3 = (C5268l) c12418l.f24519l;
        int i7 = 3;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C14300l(c8084l, i7), new C7226l(c7864l, null), 2), c5268l3, enumC8981l), AbstractC11738l.yandex(c5268l3));
        C0071l c0071l = new C0071l(i6, interfaceC14029l, i);
        C5268l c5268l4 = (C5268l) c12418l.f24519l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C14300l(c8084l, 4), new C7226l(c0071l, interfaceC14029l, i7), 2), c5268l4, enumC8981l), AbstractC11738l.yandex(c5268l4));
        C14863l c14863lSignature = Signature();
        c14863lSignature.getClass();
        AbstractC15323l.m3966final(this.f7612l, new RunnableC12388l(this, c14863lSignature, 23));
        AbstractC10999l.mopub(c18662l, ExecutorC6708l.f14063l, 0, new C16959l(this, null, 0), 2);
        if (!((Boolean) AbstractC8619l.purchase.yandex()).booleanValue() || (obj = (c13140lPro = pro()).crashlytics) == null || (method = c13140lPro.yandex) == null) {
            return;
        }
        try {
            method.invoke(c13140lPro.loadAd, obj, null);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.AbstractServiceC3639l, defpackage.AbstractServiceC4696l, android.app.Service
    public final void onDestroy() throws Throwable {
        Method method;
        advert();
        C16076l c16076lLicense = license();
        C16811l c16811l = c16076lLicense.f31499l;
        if (c16811l != null) {
            c16811l.release();
        }
        InterfaceC14029l interfaceC14029l = null;
        c16076lLicense.f31499l = null;
        Iterator it = AbstractC8669l.m2420volatile(this.f36834l).iterator();
        while (it.hasNext()) {
            ((C15926l) it.next()).yandex();
        }
        AbstractC8669l.m2414strictfp(this.f36834l, null);
        C13572l c13572l = this.f36844l;
        if (c13572l == null) {
            c13572l = null;
        }
        c13572l.getClass();
        try {
            synchronized (C13572l.loadAd) {
                C13572l.crashlytics.remove(c13572l.yandex.subs);
            }
            c13572l.yandex.m1419synchronized();
        } catch (Exception unused) {
        }
        c13572l.yandex().mo2796l(this.f36833l);
        c13572l.yandex().release();
        C0307l c0307l = this.f36842l;
        if (c0307l == null) {
            c0307l = null;
        }
        c0307l.loadAd(new C8250l(19, this));
        this.f36839l.ads(null);
        C13140l c13140lPro = pro();
        int i = 2;
        if (c13140lPro.crashlytics != null && (method = c13140lPro.yandex) != null) {
            try {
                method.invoke(c13140lPro.loadAd, null, null);
            } catch (Exception unused2) {
            }
        }
        if (((Boolean) AbstractC8619l.firebase.yandex()).booleanValue()) {
            license().f31515l.loadAd();
        }
        AbstractC10999l.subs(C17218l.f33421l, new C16959l(this, interfaceC14029l, i));
        license().f31513l.invoke();
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f36840l.ad(EnumC14812l.ON_START);
        super.onStart(intent, i);
    }

    @Override // defpackage.AbstractServiceC3639l, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        EnumC12501l enumC12501l;
        int i3 = 5;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 5, "onStartCommand intent = " + intent, null);
        String action = intent != null ? intent.getAction() : null;
        boolean zYandex = AbstractC8576l.yandex(action, "vkx.autostart");
        C18662l c18662l = this.f36830l;
        if (zYandex) {
            AbstractC10999l.mopub(c18662l, null, 0, new C7226l(this, intent, b5 == true ? 1 : 0, i3), 3);
            license().getClass();
        } else {
            int i4 = 4;
            if (AbstractC8576l.yandex(action, AbstractC1058l.yandex)) {
                int iOrdinal = ((EnumC10870l) EnumC10870l.f21977l.get(intent.getIntExtra("cmd", 0))).ordinal();
                if (iOrdinal == 0) {
                    AbstractC1058l.yandex().smaato();
                } else if (iOrdinal == 1) {
                    AbstractC1058l.yandex().isPro();
                } else if (iOrdinal == 2) {
                    C16076l c16076lYandex = AbstractC1058l.yandex();
                    c16076lYandex.getClass();
                } else if (iOrdinal == 3) {
                    C16076l c16076lYandex2 = AbstractC1058l.yandex();
                    c16076lYandex2.getClass();
                    c16076lYandex2.subs(new C8122l(new C7864l(c16076lYandex2, b3 == true ? 1 : 0, 8), null));
                } else if (iOrdinal == 4) {
                    C0554l c0554l = C16076l.f31498l;
                    if (c0554l == null) {
                        c0554l = null;
                    }
                    C16076l c16076l = (C16076l) ((C3342l) c0554l.f1958l).invoke();
                    C0554l c0554l2 = C16076l.f31498l;
                    if (c0554l2 == null) {
                        c0554l2 = null;
                    }
                    C16076l c16076l2 = (C16076l) ((C3342l) c0554l2.f1958l).invoke();
                    c16076l2.getClass();
                    int iOrdinal2 = ((EnumC12501l) c16076l2.admob(new C18606l(c16076l2, 6))).ordinal();
                    if (iOrdinal2 == 0) {
                        enumC12501l = EnumC12501l.f24640l;
                    } else if (iOrdinal2 == 1) {
                        enumC12501l = EnumC12501l.f24639l;
                    } else {
                        if (iOrdinal2 != 2) {
                            C18725l.billing();
                            return 0;
                        }
                        enumC12501l = EnumC12501l.f24641l;
                    }
                    c16076l.getClass();
                    c16076l.subs(new C7864l(enumC12501l, b4 == true ? 1 : 0, 7));
                } else {
                    if (iOrdinal != 5) {
                        C18725l.billing();
                        return 0;
                    }
                    C0554l c0554l3 = C16076l.f31498l;
                    if (c0554l3 == null) {
                        c0554l3 = null;
                    }
                    C16076l c16076l3 = (C16076l) ((C3342l) c0554l3.f1958l).invoke();
                    C0554l c0554l4 = C16076l.f31498l;
                    c16076l3.remoteconfig(!((C16076l) ((C3342l) (c0554l4 != null ? c0554l4 : null).f1958l).invoke()).amazon());
                }
            } else if (AbstractC8576l.yandex(action, AbstractC1058l.loadAd)) {
                AbstractC10999l.mopub(c18662l, null, 0, new C16959l(this, b2 == true ? 1 : 0, i4), 3);
            } else if (AbstractC8576l.yandex(action, "android.intent.action.MEDIA_BUTTON")) {
                C13572l c13572l = this.f36844l;
                if (c13572l == null) {
                    c13572l = null;
                }
                if (c13572l.yandex().mo2792l() == 0) {
                    Signature().crashlytics = true;
                    C13572l c13572l2 = this.f36844l;
                    if (c13572l2 == null) {
                        c13572l2 = null;
                    }
                    isPro(c13572l2, true);
                    AbstractC10999l.mopub(c18662l, null, 0, new C16959l(this, b == true ? 1 : 0, i3), 3);
                }
            }
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // defpackage.AbstractServiceC3639l, android.app.Service
    public final void onTaskRemoved(Intent intent) {
        C11644l c11644l = this.f36838l;
        if (c11644l == null) {
            c11644l = null;
        }
        tapsense(c11644l);
        if (!((Boolean) AbstractC8619l.smaato.yandex()).booleanValue()) {
            super.onTaskRemoved(intent);
            return;
        }
        C16076l c16076lLicense = license();
        C16811l c16811l = c16076lLicense.f31499l;
        if (c16811l != null) {
            c16811l.release();
        }
        c16076lLicense.f31499l = null;
        smaato();
    }

    public final C13140l pro() {
        return (C13140l) this.f36831l.getValue();
    }

    public final void signatures(Boolean bool) {
        C10507l c10507lCrashlytics;
        AbstractC18643l abstractC18643l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        if (!((Boolean) AbstractC8619l.admob.yandex()).booleanValue()) {
            C12417l c12417l = AbstractC9079l.yandex;
            Context applicationContext = getApplicationContext();
            C3915l c3915l = new C3915l(0);
            c3915l.amazon = R.drawable.op_action_stop;
            c3915l.amazon(AbstractC9079l.yandex);
            c3915l.billing = applicationContext.getString(R.string.op_action_stop);
            c10227lAdmob.add(c3915l.yandex());
        }
        if (bool != null && ((c10507lCrashlytics = license().crashlytics()) == null || (abstractC18643l = c10507lCrashlytics.loadAd) == null || !AbstractC1214l.loadAd(abstractC18643l))) {
            if (!bool.booleanValue()) {
                C12417l c12417l2 = AbstractC9079l.yandex;
                Context applicationContext2 = getApplicationContext();
                C3915l c3915l2 = new C3915l(59517);
                c3915l2.amazon(AbstractC9079l.loadAd);
                c3915l2.billing = applicationContext2.getString(R.string.op_action_to_library);
                c10227lAdmob.add(c3915l2.yandex());
            } else if (!((Boolean) AbstractC8619l.mopub.yandex()).booleanValue()) {
                C12417l c12417l3 = AbstractC9079l.yandex;
                Context applicationContext3 = getApplicationContext();
                C3915l c3915l3 = new C3915l(1042557);
                c3915l3.amazon(AbstractC9079l.loadAd);
                c3915l3.billing = applicationContext3.getString(R.string.op_action_to_library_remove);
                c10227lAdmob.add(c3915l3.yandex());
            }
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        this.f36843l = c10227lPurchase;
        C13572l c13572l = this.f36844l;
        if (c13572l == null) {
            c13572l = null;
        }
        c13572l.getClass();
        AbstractC12442l.metrica(c10227lPurchase, "layout must not be null");
        C3726l c3726l = c13572l.yandex;
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(c10227lPurchase);
        c3726l.premium = abstractC1186lSignature;
        c3726l.admob.ad = abstractC1186lSignature;
        c3726l.admob(new C18317l(abstractC1186lSignature, 0));
    }

    @Override // androidx.media3.session.MediaLibraryService, defpackage.AbstractServiceC3639l
    /* JADX INFO: renamed from: startapp, reason: merged with bridge method [inline-methods] */
    public final C13572l subs(C6499l c6499l) {
        C13572l c13572l;
        try {
            if (!((C1847l) this.f36835l.getValue()).loadAd(c6499l) || (c13572l = this.f36844l) == null) {
                return null;
            }
            return c13572l;
        } catch (Exception e) {
            e.printStackTrace();
            C13572l c13572l2 = this.f36844l;
            if (c13572l2 == null) {
                return null;
            }
            return c13572l2;
        }
    }

    public final C9928l subscription() {
        C17804l c17804lAmazon = AbstractC1213l.amazon(this, license().f31502l, license().f31505l, new C3342l(this, 6), new C3342l(this, 7), license().f31519l);
        C6209l c6209l = new C6209l();
        C17505l c17505l = c17804lAmazon.f34701l;
        c17505l.getClass();
        c17505l.f34110l.yandex(c6209l);
        c17804lAmazon.m4415l();
        C1080l c1080l = c17804lAmazon.f34703l;
        if (((Integer) c1080l.tapsense()).intValue() != 0) {
            C12023l c12023l = new C12023l(0 == true ? 1 : 0, c17804lAmazon);
            AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l.f2975l).yandex.getLooper());
            c1080l.f2972l++;
            c1080l.m797private(new RunnableC7762l(c1080l, c12023l, 11));
            c1080l.m789continue(Integer.valueOf(((Integer) c1080l.f2976l).intValue()));
        }
        return new C9928l(c17804lAmazon, new C0059l(0, 9, C16076l.class, license(), "preloadManager", "getPreloadManager$orbitplayback()Lua/itaysonlab/vkxreborn/playback/preload/PreloadManager;"));
    }

    public final void tapsense(InterfaceC9814l interfaceC9814l) {
        if (interfaceC9814l.purchase() == 1) {
            return;
        }
        C10507l c10507lAdmob = license().f31521l.admob(Integer.valueOf(interfaceC9814l.mo2761implements()));
        long jMo2771l = interfaceC9814l.mo2771l();
        InterfaceC17817l interfaceC17817l = license().f31521l.amazon;
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(this.f36830l, ExecutorC6708l.f14063l, 0, new C11287l(c10507lAdmob, this, jMo2771l, interfaceC17817l, null, 4), 2);
    }
}
