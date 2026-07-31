package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC13840l extends ViewGroup implements InterfaceC11218l, InterfaceC6313l, InterfaceC1403l, InterfaceC18325l, InterfaceC0159l, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC8504l {

    /* JADX INFO: renamed from: lٕؕٝ, reason: contains not printable characters */
    public static Method f26991l;

    /* JADX INFO: renamed from: lٟؖٓ, reason: contains not printable characters */
    public static Class f26992l;

    /* JADX INFO: renamed from: lؗۘۨ, reason: contains not printable characters */
    public static Method f26993l;

    /* JADX INFO: renamed from: lؙۨۨ, reason: contains not printable characters */
    public static Method f26994l;

    /* JADX INFO: renamed from: lٌّۚ, reason: contains not printable characters */
    public static RunnableC15875l f26996l;

    /* JADX INFO: renamed from: lٕٔۚ, reason: contains not printable characters */
    public static Method f26997l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C8610l f26998l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public C4666l f26999l;

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public MotionEvent f27000l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C12463l f27001l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public C8697l f27002l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC9659l f27003l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public InterfaceC12932l f27004l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C1958l f27005l;

    /* JADX INFO: renamed from: lؓٗؗ, reason: contains not printable characters */
    public float f27006l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f27007l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC7630l f27008l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public final Matrix f27009l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C18483l f27010l;

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public C3715l f27011l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C0151l f27012l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11315l f27013l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public boolean f27014l;

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public final C13180l f27015l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public long f27016l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public C15519l f27017l;

    /* JADX INFO: renamed from: lؖٙؓ, reason: contains not printable characters */
    public float f27018l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f27019l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C8610l f27020l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public boolean f27021l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C4580l f27022l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C1241l f27023l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public long f27024l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f27025l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C11096l f27026l;

    /* JADX INFO: renamed from: lؘٝؕ, reason: contains not printable characters */
    public final C8662l f27027l;

    /* JADX INFO: renamed from: lؘٜۘ, reason: contains not printable characters */
    public boolean f27028l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public C8483l f27029l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C16977l f27030l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final RunnableC10804l f27031l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C18480l f27032l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public final float[] f27033l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public boolean f27034l;

    /* JADX INFO: renamed from: lؚٕۤ, reason: contains not printable characters */
    public float f27035l;

    /* JADX INFO: renamed from: lؚۤ۟, reason: contains not printable characters */
    public final C17524l f27036l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public long f27037l;

    /* JADX INFO: renamed from: lًؙؗ, reason: contains not printable characters */
    public Function2 f27038l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C6556l f27039l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10086l f27040l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f27041l;

    /* JADX INFO: renamed from: lٍٜٛ, reason: contains not printable characters */
    public final C0848l f27042l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C10086l f27043l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC10091l f27044l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C3272l f27045l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public final InterfaceC8714l f27046l;

    /* JADX INFO: renamed from: lًَؘ, reason: contains not printable characters */
    public boolean f27047l;

    /* JADX INFO: renamed from: lُۢۗ, reason: contains not printable characters */
    public View f27048l;

    /* JADX INFO: renamed from: lُۨ, reason: contains not printable characters */
    public final C12463l f27049l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public final int[] f27050l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public Function1 f27051l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public C8877l f27052l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f27053l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C12463l f27054l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public C8600l f27055l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public final C5227l f27056l;

    /* JADX INFO: renamed from: lٓؔۧ, reason: contains not printable characters */
    public long f27057l;

    /* JADX INFO: renamed from: lؙٓۦ, reason: contains not printable characters */
    public boolean f27058l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C15552l f27059l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C10086l f27060l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final RunnableC12322l f27061l;

    /* JADX INFO: renamed from: lٜٔٚ, reason: contains not printable characters */
    public boolean f27062l;

    /* JADX INFO: renamed from: lٕؑٞ, reason: contains not printable characters */
    public float f27063l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11603l f27064l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public final C10086l f27065l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final View f27066l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final C5265l f27067l;

    /* JADX INFO: renamed from: lٖ٘ؕ, reason: contains not printable characters */
    public final C17524l f27068l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public final float[] f27069l;

    /* JADX INFO: renamed from: lٖۣ۠, reason: contains not printable characters */
    public final C11351l f27070l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final ViewOnDragListenerC13486l f27071l;

    /* JADX INFO: renamed from: lٖٗ٘, reason: contains not printable characters */
    public final C17240l f27072l;

    /* JADX INFO: renamed from: lٟٗٛ, reason: contains not printable characters */
    public final RunnableC5360l f27073l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public final AtomicReference f27074l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C6718l f27075l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public final float[] f27076l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C3654l f27077l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0348l f27078l;

    /* JADX INFO: renamed from: lُ٘ۙ, reason: contains not printable characters */
    public final RunnableC12322l f27079l;

    /* JADX INFO: renamed from: lؚۤۜ, reason: contains not printable characters */
    public static final C15718l f26995l = new C15718l(23);

    /* JADX INFO: renamed from: lؔۗۖ, reason: contains not printable characters */
    public static final C12463l f26990l = new C12463l();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTreeObserverOnGlobalLayoutListenerC13840l(Context context, C11096l c11096l) {
        C4580l c4580l;
        EnumC9931l enumC9931l;
        super(context);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27026l = c11096l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27025l = 9205357640488583168L;
        int i = 1;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27007l = true;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27008l = C11485l.f23076l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27013l = new C11315l();
        int i2 = 0;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27061l = new RunnableC12322l(viewTreeObserverOnGlobalLayoutListenerC13840l, i2);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27040l = new C10086l(AbstractC5998l.yandex(context), C1461l.f3659l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27059l = new C15552l(viewTreeObserverOnGlobalLayoutListenerC13840l, viewTreeObserverOnGlobalLayoutListenerC13840l);
        c11096l.purchase();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27004l = c11096l.crashlytics.isPro();
        int i3 = 0;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27071l = new ViewOnDragListenerC13486l(new C4236l(3, viewTreeObserverOnGlobalLayoutListenerC13840l, ViewTreeObserverOnGlobalLayoutListenerC13840l.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0, i3, 0));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27043l = AbstractC8020l.smaato(Boolean.FALSE);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27020l = AbstractC8020l.mopub(new C17524l(viewTreeObserverOnGlobalLayoutListenerC13840l, i2));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27031l = new RunnableC10804l();
        C3654l c3654l = new C3654l(3);
        c3654l.m1400try(C2670l.crashlytics);
        c3654l.m1391public(viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity());
        c3654l.m1399transient(viewTreeObserverOnGlobalLayoutListenerC13840l.getViewConfiguration());
        c3654l.m1374break(AbstractC15560l.admob(new C2098l(viewTreeObserverOnGlobalLayoutListenerC13840l), ((C15552l) viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner()).purchase).premium(viewTreeObserverOnGlobalLayoutListenerC13840l.m3780getDragAndDropManager().crashlytics));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27077l = c3654l;
        C16977l c16977l = AbstractC6903l.yandex;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27030l = new C16977l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27012l = new C0151l(viewTreeObserverOnGlobalLayoutListenerC13840l.getLayoutNodes(), viewTreeObserverOnGlobalLayoutListenerC13840l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27010l = new C18483l(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot(), new C5660l(), viewTreeObserverOnGlobalLayoutListenerC13840l.getLayoutNodes());
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = new ViewOnAttachStateChangeListenerC9659l(viewTreeObserverOnGlobalLayoutListenerC13840l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27003l = viewOnAttachStateChangeListenerC9659l;
        ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = new ViewOnAttachStateChangeListenerC0348l(viewTreeObserverOnGlobalLayoutListenerC13840l, new Cconst(0, viewTreeObserverOnGlobalLayoutListenerC13840l, AbstractC3234l.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, i3, 22));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27078l = viewOnAttachStateChangeListenerC0348l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27023l = new C1241l(viewTreeObserverOnGlobalLayoutListenerC13840l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27039l = new C6556l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27054l = new C12463l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27075l = new C6718l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27032l = new C18480l(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27060l = AbstractC8020l.smaato(new Configuration(context.getResources().getConfiguration()));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f26998l = AbstractC8020l.mopub(new C17524l(viewTreeObserverOnGlobalLayoutListenerC13840l, 2));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27067l = amazon() ? new C5265l(viewTreeObserverOnGlobalLayoutListenerC13840l, viewTreeObserverOnGlobalLayoutListenerC13840l.getAutofillTree()) : null;
        if (amazon()) {
            c4580l = new C4580l(new C6079l(context), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            viewTreeObserverOnGlobalLayoutListenerC13840l = this;
        } else {
            c4580l = null;
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27022l = c4580l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27056l = new C5227l(new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27005l = new C1958l(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27024l = 9223372034707292159L;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27050l = new int[]{0, 0};
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27033l = C10924l.yandex();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27009l = new Matrix();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27069l = C10924l.yandex();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27076l = C10924l.yandex();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27016l = -1L;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27037l = 9187343241974906880L;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27074l = new AtomicReference(null);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27046l = c11096l.startapp;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC17194l.yandex;
        EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
        if (layoutDirection != 0) {
            enumC9931l = layoutDirection != 1 ? null : EnumC9931l.f20222l;
        } else {
            enumC9931l = enumC9931l2;
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27065l = AbstractC8020l.smaato(enumC9931l != null ? enumC9931l : enumC9931l2);
        C13180l c13180l = new C13180l();
        new C17893l(0, new C4101l[16]);
        new C17893l(0, new C5138l[16]);
        new C17893l(0, new C3654l[16]);
        new C17893l(0, new C5138l[16]);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27015l = c13180l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27042l = new C0848l(2);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27049l = new C12463l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27063l = Float.NaN;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27018l = Float.NaN;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27035l = Float.NaN;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27006l = Float.NaN;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27073l = new RunnableC5360l(i2, viewTreeObserverOnGlobalLayoutListenerC13840l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27079l = new RunnableC12322l(viewTreeObserverOnGlobalLayoutListenerC13840l, i);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27038l = new C0976l(i2, viewTreeObserverOnGlobalLayoutListenerC13840l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27027l = new C8662l(context, new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i2));
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27036l = new C17524l(viewTreeObserverOnGlobalLayoutListenerC13840l, 4);
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27068l = new C17524l(viewTreeObserverOnGlobalLayoutListenerC13840l, i);
        viewTreeObserverOnGlobalLayoutListenerC13840l.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0348l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.setWillNotDraw(false);
        viewTreeObserverOnGlobalLayoutListenerC13840l.setFocusable(true);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            C6885l.yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l, 1, false);
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l.setFocusableInTouchMode(true);
        viewTreeObserverOnGlobalLayoutListenerC13840l.setClipChildren(false);
        AbstractC15872l.vip(viewTreeObserverOnGlobalLayoutListenerC13840l, viewOnAttachStateChangeListenerC9659l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.setOnDragListener(viewTreeObserverOnGlobalLayoutListenerC13840l.m3780getDragAndDropManager());
        if (i4 >= 29) {
            C7956l.yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l);
        }
        if (remoteconfig()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            viewTreeObserverOnGlobalLayoutListenerC13840l.f27066l = view;
            viewTreeObserverOnGlobalLayoutListenerC13840l.addView(view, -1);
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27072l = i4 >= 31 ? new C17240l(3) : null;
        viewTreeObserverOnGlobalLayoutListenerC13840l.f27070l = new C11351l(viewTreeObserverOnGlobalLayoutListenerC13840l);
    }

    public static boolean amazon() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static long billing(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        C18073l.admob();
        return 0L;
    }

    public static void firebase(C3654l c3654l) {
        c3654l.m1398throws();
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            firebase((C3654l) objArr[i2]);
        }
    }

    private final C10383l getCanvasHolder() {
        return this.f27026l.Signature;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f27020l.getValue()).booleanValue();
    }

    private final C8483l getLegacyTextInputServiceAndroid() {
        C8483l c8483l = this.f27029l;
        if (c8483l != null) {
            return c8483l;
        }
        C8483l c8483l2 = new C8483l(getView(), this);
        this.f27029l = c8483l2;
        return c8483l2;
    }

    public static final void loadAd(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iAmazon;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27003l;
        if (AbstractC8576l.yandex(str, viewOnAttachStateChangeListenerC9659l.f19721l)) {
            int iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i);
            if (iAmazon2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iAmazon2);
                return;
            }
            return;
        }
        if (!AbstractC8576l.yandex(str, viewOnAttachStateChangeListenerC9659l.f19733l) || (iAmazon = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iAmazon);
    }

    public static void purchase(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l) {
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt).pro();
            } else if (childAt instanceof ViewGroup) {
                purchase((ViewGroup) childAt);
            }
        }
    }

    public static boolean remoteconfig() {
        return Build.VERSION.SDK_INT >= 35;
    }

    private final void setAttached(boolean z) {
        this.f27043l.setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC13490l interfaceC13490l) {
        this.f27040l.setValue(interfaceC13490l);
    }

    private void setLayoutDirection(EnumC9931l enumC9931l) {
        this.f27065l.setValue(enumC9931l);
    }

    public static boolean vip(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C10716l.yandex.yandex(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public final void Signature(C3654l c3654l, long j) {
        C1958l c1958l = this.f27005l;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c1958l.vip(c3654l, j);
            if (!c1958l.loadAd.m4540else()) {
                c1958l.crashlytics(false);
                getRectManager().yandex();
                this.f27068l.invoke();
                if (this.f27053l) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f27053l = false;
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    public final void ad(C3654l c3654l) {
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = this.f27003l;
        viewOnAttachStateChangeListenerC9659l.f19723l = true;
        if (viewOnAttachStateChangeListenerC9659l.Signature()) {
            viewOnAttachStateChangeListenerC9659l.license(c3654l);
        }
        ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = this.f27078l;
        viewOnAttachStateChangeListenerC0348l.f1403l = true;
        viewOnAttachStateChangeListenerC0348l.amazon();
    }

    public final void adcel(float[] fArr) {
        applovin();
        C10924l.subs(fArr, this.f27069l);
        AbstractC3234l.loadAd(fArr, Float.intBitsToFloat((int) (this.f27037l >> 32)), Float.intBitsToFloat((int) (this.f27037l & 4294967295L)), this.f27033l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C6543l c6543l = ((C15552l) getFocusOwner()).crashlytics;
        if (!c6543l.f29462l) {
            return;
        }
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitSubtreeIf called on an unattached node");
        }
        C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l = c6543l.f29454l;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 == null) {
            AbstractC5573l.yandex(c17893l, abstractC14971l);
        } else {
            c17893l.crashlytics(abstractC14971l2);
        }
        while (true) {
            int i3 = c17893l.f34846l;
            if (i3 == 0) {
                return;
            }
            AbstractC14971l abstractC14971l3 = (AbstractC14971l) c17893l.vip(i3 - 1);
            if ((abstractC14971l3.f29457l & 1024) != 0) {
                for (AbstractC14971l abstractC14971l4 = abstractC14971l3; abstractC14971l4 != null && abstractC14971l4.f29462l; abstractC14971l4 = abstractC14971l4.f29460l) {
                    if ((abstractC14971l4.f29450l & 1024) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l4;
                        C17893l c17893l2 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                if (c6543l2.f29462l && c6543l2.m2024l().yandex) {
                                    super.addFocusables(arrayList, i, i2);
                                    C6543l c6543l3 = ((C15552l) getFocusOwner()).crashlytics;
                                    if (c6543l3.f29462l) {
                                        if (!c6543l3.f29454l.f29462l) {
                                            AbstractC0081l.crashlytics("visitSubtreeIf called on an unattached node");
                                        }
                                        C17893l c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                        AbstractC14971l abstractC14971l5 = c6543l3.f29454l;
                                        AbstractC14971l abstractC14971l6 = abstractC14971l5.f29460l;
                                        if (abstractC14971l6 == null) {
                                            AbstractC5573l.yandex(c17893l3, abstractC14971l5);
                                        } else {
                                            c17893l3.crashlytics(abstractC14971l6);
                                        }
                                        while (true) {
                                            int i4 = c17893l3.f34846l;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            AbstractC14971l abstractC14971l7 = (AbstractC14971l) c17893l3.vip(i4 - 1);
                                            if ((abstractC14971l7.f29457l & 1024) != 0) {
                                                for (AbstractC14971l abstractC14971l8 = abstractC14971l7; abstractC14971l8 != null && abstractC14971l8.f29462l; abstractC14971l8 = abstractC14971l8.f29460l) {
                                                    if ((abstractC14971l8.f29450l & 1024) != 0) {
                                                        AbstractC14971l abstractC14971lLoadAd2 = abstractC14971l8;
                                                        C17893l c17893l4 = null;
                                                        while (abstractC14971lLoadAd2 != null) {
                                                            if (abstractC14971lLoadAd2 instanceof C6543l) {
                                                                C6543l c6543l4 = (C6543l) abstractC14971lLoadAd2;
                                                                if (c6543l4.f29462l) {
                                                                    C15468l c15468lM2024l = c6543l4.m2024l();
                                                                    if (c6543l4.f29462l && !c6543l4.f13659l && c15468lM2024l.yandex) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                                                int i5 = 0;
                                                                for (AbstractC14971l abstractC14971l9 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l9 != null; abstractC14971l9 = abstractC14971l9.f29460l) {
                                                                    if ((abstractC14971l9.f29450l & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            abstractC14971lLoadAd2 = abstractC14971l9;
                                                                        } else {
                                                                            if (c17893l4 == null) {
                                                                                c17893l4 = new C17893l(0, new AbstractC14971l[16]);
                                                                            }
                                                                            if (abstractC14971lLoadAd2 != null) {
                                                                                c17893l4.crashlytics(abstractC14971lLoadAd2);
                                                                                abstractC14971lLoadAd2 = null;
                                                                            }
                                                                            c17893l4.crashlytics(abstractC14971l9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l4);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC5573l.yandex(c17893l3, abstractC14971l7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i6 = 0;
                                for (AbstractC14971l abstractC14971l10 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l10 != null; abstractC14971l10 = abstractC14971l10.f29460l) {
                                    if ((abstractC14971l10.f29450l & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l10;
                                        } else {
                                            if (c17893l2 == null) {
                                                c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l2.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l2.crashlytics(abstractC14971l10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                        }
                    }
                }
            }
            AbstractC5573l.yandex(c17893l, abstractC14971l3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        Unit unit = Unit.INSTANCE;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    public final InterfaceC10702l admob(Function2 function2, C10446l c10446l, C11925l c11925l) {
        C17893l c17893l;
        Reference referencePoll;
        Object obj;
        if (c11925l != null) {
            return new C6577l(c11925l, null, this, function2, c10446l);
        }
        do {
            C0848l c0848l = this.f27042l;
            ReferenceQueue referenceQueue = (ReferenceQueue) c0848l.f2498l;
            c17893l = (C17893l) c0848l.f2499l;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c17893l.remoteconfig(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = c17893l.f34846l;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c17893l.vip(i - 1)).get();
        } while (obj == null);
        InterfaceC10702l interfaceC10702l = (InterfaceC10702l) obj;
        if (interfaceC10702l == null) {
            return new C6577l(getGraphicsContext().crashlytics(), getGraphicsContext(), this, function2, c10446l);
        }
        C6577l c6577l = (C6577l) interfaceC10702l;
        InterfaceC3685l interfaceC3685l = c6577l.f13736l;
        if (interfaceC3685l == null) {
            throw AbstractC5020l.metrica("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c6577l.f13737l.subscription) {
            AbstractC0081l.yandex("layer should have been released before reuse");
        }
        c6577l.f13737l = interfaceC3685l.crashlytics();
        c6577l.f13731l = false;
        c6577l.f13743l = function2;
        c6577l.f13742l = c10446l;
        c6577l.f13739l = false;
        c6577l.f13749l = false;
        c6577l.f13738l = true;
        C10924l.amazon(c6577l.f13734l);
        float[] fArr = c6577l.f13745l;
        if (fArr != null) {
            C10924l.amazon(fArr);
        }
        c6577l.f13741l = C1723l.loadAd;
        c6577l.f13733l = false;
        c6577l.f13746l = 9223372034707292159L;
        c6577l.f13735l = null;
        c6577l.f13748l = 0;
        return interfaceC10702l;
    }

    public final void advert(C3654l c3654l, boolean z, boolean z2, boolean z3) {
        C3654l c3654lLicense;
        C3654l c3654lLicense2;
        C1958l c1958l = this.f27005l;
        if (!z) {
            if (c1958l.subscription(c3654l, z2) && z3) {
                m3774synchronized(c3654l);
                return;
            }
            return;
        }
        C18449l c18449l = c1958l.loadAd;
        C3654l c3654l2 = c3654l.f7693l;
        C14070l c14070l = c3654l.f7667l;
        if (c3654l2 == null) {
            AbstractC0081l.crashlytics("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iInmobi = AbstractC5020l.inmobi(c14070l.amazon);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                return;
            }
            if (iInmobi != 2 && iInmobi != 3) {
                if (iInmobi != 4) {
                    C18725l.billing();
                    return;
                }
                if (!c14070l.purchase || z2) {
                    c14070l.purchase = true;
                    c14070l.startapp.f29321l = true;
                    if (c3654l.f7684l) {
                        return;
                    }
                    if ((AbstractC8576l.yandex(c3654l.m1380extends(), Boolean.TRUE) || C1958l.isPro(c3654l)) && ((c3654lLicense = c3654l.license()) == null || !c3654lLicense.f7667l.purchase)) {
                        c18449l.ads(1, c3654l);
                    } else if ((c3654l.m1389private() || C1958l.firebase(c3654l)) && ((c3654lLicense2 = c3654l.license()) == null || !c3654lLicense2.ads())) {
                        c18449l.ads(3, c3654l);
                    }
                    if (c1958l.amazon || !z3) {
                        return;
                    }
                    m3774synchronized(c3654l);
                    return;
                }
                return;
            }
        }
        c1958l.admob.crashlytics(new C13255l(c3654l, true, z2));
    }

    public final void applovin() {
        if (this.f27014l) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f27016l) {
            this.f27016l = jCurrentAnimationTimeMillis;
            inmobi();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f27050l;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f27037l = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void appmetrica(MotionEvent motionEvent) {
        this.f27016l = AnimationUtils.currentAnimationTimeMillis();
        inmobi();
        float x = motionEvent.getX();
        long jLoadAd = C10924l.loadAd((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.f27069l);
        this.f27037l = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jLoadAd >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jLoadAd & 4294967295L)))) & 4294967295L);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (amazon()) {
            C4580l c4580lM3779getAutofillManager = m3779getAutofillManager();
            if (c4580lM3779getAutofillManager != null) {
                c4580lM3779getAutofillManager.loadAd(sparseArray);
            }
            C5265l c5265lM3778getAutofill = m3778getAutofill();
            if (c5265lM3778getAutofill != null) {
                AbstractC5941l.m1897native(c5265lM3778getAutofill, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f27003l.smaato(i, this.f27025l, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f27003l.smaato(i, this.f27025l, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C12463l c12463l = this.f27054l;
        if (!isAttachedToWindow()) {
            firebase(getRoot());
        }
        tapsense(true);
        AbstractC9620l.isPro().remoteconfig();
        this.f27034l = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C10383l canvasHolder = getCanvasHolder();
            C2151l c2151l = canvasHolder.yandex;
            Canvas canvas2 = c2151l.yandex;
            c2151l.yandex = canvas;
            getRoot().isPro(c2151l, null);
            canvasHolder.yandex.yandex = canvas2;
            if (c12463l.firebase()) {
                int i = c12463l.loadAd;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C6577l) ((InterfaceC10702l) c12463l.admob(i2))).mopub();
                }
            }
            int i3 = AbstractC5091l.f11099l;
            c12463l.billing();
            this.f27034l = false;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            C12463l c12463l2 = this.f27001l;
            if (c12463l2 != null) {
                c12463l.loadAd(c12463l2);
                c12463l2.billing();
            }
            if (remoteconfig()) {
                if (Float.compare(this.f27063l, this.f27035l) != 0) {
                    float f = this.f27063l;
                    this.f27035l = f;
                    AbstractC11405l.yandex(this, f);
                }
                View view = this.f27066l;
                if (view != null) {
                    if (Float.compare(this.f27018l, this.f27006l) != 0) {
                        float f2 = this.f27018l;
                        this.f27006l = f2;
                        AbstractC11405l.yandex(view, f2);
                    }
                    if (!Float.isNaN(this.f27018l)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f27063l = Float.NaN;
                this.f27018l = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 2025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC13840l.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        if (startapp(r24) == false) goto L76;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC13840l.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((C15552l) getFocusOwner()).amazon(keyEvent, new C4307l(this, keyEvent, i));
        }
        C12771l c12771l = this.f27026l.tapsense;
        int metaState = keyEvent.getMetaState();
        c12771l.getClass();
        AbstractC10896l.yandex.setValue(new C1000l(metaState));
        return ((C15552l) getFocusOwner()).amazon(keyEvent, C16395l.f32087l) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C18289l c18289l;
        if (isFocused()) {
            C15552l c15552l = (C15552l) getFocusOwner();
            if (c15552l.amazon.purchase) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C6543l c6543lLoadAd = AbstractC11156l.loadAd(c15552l.crashlytics);
                if (c6543lLoadAd != null) {
                    if (!c6543lLoadAd.f29454l.f29462l) {
                        AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                    }
                    AbstractC14971l abstractC14971l = c6543lLoadAd.f29454l;
                    C3654l c3654lMetrica = AbstractC5573l.metrica(c6543lLoadAd);
                    while (c3654lMetrica != null) {
                        if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 131072) != 0) {
                            while (abstractC14971l != null) {
                                if ((abstractC14971l.f29450l & 131072) != 0) {
                                    AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                                    C17893l c17893l = null;
                                    while (abstractC14971lLoadAd != null) {
                                        if ((abstractC14971lLoadAd.f29450l & 131072) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                            int i = 0;
                                            for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                                if ((abstractC14971l2.f29450l & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        Unit unit = Unit.INSTANCE;
                                                        abstractC14971lLoadAd = abstractC14971l2;
                                                    } else {
                                                        if (c17893l == null) {
                                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                        }
                                                        if (abstractC14971lLoadAd != null) {
                                                            c17893l.crashlytics(abstractC14971lLoadAd);
                                                            abstractC14971lLoadAd = null;
                                                        }
                                                        c17893l.crashlytics(abstractC14971l2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                                    }
                                }
                                abstractC14971l = abstractC14971l.f29456l;
                            }
                        }
                        c3654lMetrica = c3654lMetrica.license();
                        abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (amazon()) {
            this.f27028l = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.f27028l = false;
                premium(viewStructure);
            } catch (Throwable th) {
                this.f27028l = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C11634l.yandex.yandex(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object c0512l;
        C6543l c6543lBilling;
        if (this.f27058l) {
            RunnableC12322l runnableC12322l = this.f27079l;
            removeCallbacks(runnableC12322l);
            MotionEvent motionEvent2 = this.f27000l;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f27058l = false;
            } else {
                runnableC12322l.run();
            }
        }
        if (!vip(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || startapp(motionEvent))) {
            int iIsPro = isPro(motionEvent);
            int i = 1;
            if ((iIsPro & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c0512l = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c0512l = new C0512l(i);
                }
                if (c0512l.equals(new C0512l(i)) && (c6543lBilling = ((C15552l) getFocusOwner()).billing()) != null) {
                    AbstractC18026l abstractC18026lVip = AbstractC5573l.vip(c6543lBilling);
                    if (!AbstractC9690l.crashlytics(abstractC18026lVip).mo2592synchronized(abstractC18026lVip, true).yandex((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        AbstractC2812l.mopub(getFocusOwner());
                    }
                }
            }
            if ((iIsPro & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m3766extends(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (AbstractC8576l.yandex(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(AbstractC5998l.yandex(getContext()));
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        C15718l c15718l = f26995l;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return C15718l.remoteconfig(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(c15718l, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C8896l c8896lYandex;
        if (view == null || this.f27005l.crashlytics) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (viewFindNextFocus == null || !AbstractC3234l.yandex(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C6543l c6543lLoadAd = AbstractC11156l.loadAd(((C15552l) getFocusOwner()).crashlytics);
            c8896lYandex = c6543lLoadAd != null ? AbstractC11156l.crashlytics(c6543lLoadAd) : null;
            if (c8896lYandex == null) {
                c8896lYandex = AbstractC17194l.yandex(view, this);
            }
        } else {
            c8896lYandex = AbstractC17194l.yandex(view, this);
        }
        C3475l c3475lAmazon = AbstractC17194l.amazon(i);
        int i2 = c3475lAmazon != null ? c3475lAmazon.yandex : 6;
        C10700l c10700l = new C10700l();
        if (((C15552l) getFocusOwner()).purchase(i2, c8896lYandex, new C15121l(c10700l, 0)) == null) {
            return view;
        }
        Object obj = c10700l.f21708l;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC11852l.isPro(AbstractC11156l.crashlytics((C6543l) obj), AbstractC17194l.yandex(viewFindNextFocus, this), c8896lYandex, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m3767for() {
        boolean z;
        int i;
        int[] iArr = this.f27050l;
        getLocationOnScreen(iArr);
        long j = this.f27024l;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.f27016l >= 0) {
            z = false;
        } else {
            this.f27024l = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                C17893l c17893lSignatures = getRoot().signatures();
                Object[] objArr = c17893lSignatures.f34848l;
                int i5 = c17893lSignatures.f34846l;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C3654l) objArr[i6]).f7667l.startapp.m3904l();
                }
                z = true;
            }
        }
        applovin();
        View rootView = this.f27048l;
        if (rootView == null) {
            rootView = getRootView();
            this.f27048l = rootView;
        }
        C0151l rectManager = getRectManager();
        long j2 = this.f27024l;
        long jIsPro = AbstractC3383l.isPro(this.f27037l);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f27069l;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        C6709l c6709l = rectManager.amazon;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.mopub = c6709l.crashlytics(j2, jIsPro, fArr, width, height) || rectManager.mopub;
        this.f27005l.crashlytics(z);
        getRectManager().yandex();
    }

    public InterfaceC7628l getAccessibilityManager() {
        return this.f27026l.firebase;
    }

    public final C8697l getAndroidViewsHandler() {
        return this.f27002l;
    }

    public C6556l getAutofillTree() {
        return this.f27039l;
    }

    public InterfaceC7948l getClipboard() {
        return this.f27026l.vip;
    }

    public InterfaceC2752l getClipboardManager() {
        return this.f27026l.remoteconfig;
    }

    public final C11096l getComposeViewContext() {
        return this.f27026l;
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f27047l;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f27060l.getValue();
    }

    public final ViewOnAttachStateChangeListenerC0348l getContentCaptureManager$ui() {
        return this.f27078l;
    }

    public InterfaceC12932l getCoroutineContext() {
        return this.f27004l;
    }

    public InterfaceC13490l getDensity() {
        return (InterfaceC13490l) this.f27040l.getValue();
    }

    public C8896l getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C6543l c6543lLoadAd = AbstractC11156l.loadAd(((C15552l) getFocusOwner()).crashlytics);
            if (c6543lLoadAd != null) {
                return AbstractC11156l.crashlytics(c6543lLoadAd);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC17194l.yandex(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC6497l getFocusOwner() {
        return this.f27059l;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C8896l embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.yandex);
            rect.top = Math.round(embeddedViewFocusRect.loadAd);
            rect.right = Math.round(embeddedViewFocusRect.crashlytics);
            rect.bottom = Math.round(embeddedViewFocusRect.amazon);
            return;
        }
        if (AbstractC8576l.yandex(((C15552l) getFocusOwner()).purchase(6, null, C11192l.f22518l), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
        }
    }

    public InterfaceC16061l getFontFamilyResolver() {
        return (InterfaceC16061l) this.f27046l.getValue();
    }

    public InterfaceC12613l getFontLoader() {
        return this.f27026l.metrica;
    }

    public final InterfaceC10091l getFrameEndScheduler$ui() {
        return this.f27044l;
    }

    public InterfaceC3685l getGraphicsContext() {
        return this.f27023l;
    }

    public InterfaceC1234l getHapticFeedBack() {
        return this.f27026l.adcel;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f27005l.loadAd.m4540else() || !this.f27013l.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX INFO: renamed from: getInputModeManager, reason: merged with bridge method [inline-methods] */
    public C8600l m3781getInputModeManager() {
        C8600l c8600l = this.f27055l;
        if (c8600l == null) {
            c8600l = new C8600l(isInTouchMode() ? 1 : 2);
            this.f27055l = c8600l;
        }
        return c8600l;
    }

    public final RunnableC10804l getInsetsWatcher() {
        return this.f27031l;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f27016l;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC9931l getLayoutDirection() {
        return (EnumC9931l) this.f27065l.getValue();
    }

    public C10537l getLocaleList() {
        return (C10537l) this.f26998l.getValue();
    }

    public long getMeasureIteration() {
        C1958l c1958l = this.f27005l;
        if (!c1958l.crashlytics) {
            AbstractC0081l.yandex("measureIteration should be only used during the measure/layout pass");
        }
        return c1958l.mopub;
    }

    public C13180l getModifierLocalManager() {
        return this.f27015l;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC13840l getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC9601l getPlacementScope() {
        int i = AbstractC7357l.loadAd;
        return new C17971l(1, this);
    }

    public final Function2<C3475l, Boolean, Unit> getPlayNavigationSoundEffect$ui() {
        return this.f27038l;
    }

    public InterfaceC11051l getPointerIconService() {
        return this.f27070l;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C3272l m3768getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f27045l;
    }

    public C0151l getRectManager() {
        return this.f27012l;
    }

    public InterfaceC7630l getRetainedValuesStore() {
        return this.f27008l;
    }

    public C3654l getRoot() {
        return this.f27077l;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C17240l c17240l;
        if (Build.VERSION.SDK_INT < 31 || (c17240l = this.f27072l) == null) {
            return false;
        }
        return ((Boolean) ((C10086l) c17240l.loadAd).getValue()).booleanValue();
    }

    public C18483l getSemanticsOwner() {
        return this.f27010l;
    }

    public C6742l getSharedDrawScope() {
        return this.f27026l.subscription;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C2554l.yandex.yandex(this) : this.f27019l;
    }

    public C5227l getSnapshotObserver() {
        return this.f27056l;
    }

    public InterfaceC8533l getSoftwareKeyboardController() {
        C4666l c4666l = this.f26999l;
        if (c4666l != null) {
            return c4666l;
        }
        C4666l c4666l2 = new C4666l(getTextInputService());
        this.f26999l = c4666l2;
        return c4666l2;
    }

    public C8877l getTextInputService() {
        C8877l c8877l = this.f27052l;
        if (c8877l != null) {
            return c8877l;
        }
        C8877l c8877l2 = new C8877l(getLegacyTextInputServiceAndroid());
        this.f27052l = c8877l2;
        return c8877l2;
    }

    public InterfaceC9801l getTextToolbar() {
        C3715l c3715l = this.f27011l;
        if (c3715l != null) {
            return c3715l;
        }
        C3715l c3715l2 = new C3715l();
        new C11029l(1, c3715l2);
        this.f27011l = c3715l2;
        return c3715l2;
    }

    public final InterfaceC1233l getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC3114l getViewConfiguration() {
        return this.f27026l.ads;
    }

    public InterfaceC2229l getWindowInfo() {
        return this.f27026l.tapsense;
    }

    public final void inmobi() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.f27069l;
        int[] iArr = this.f27050l;
        if (i >= 29) {
            C18021l.yandex.yandex(this, fArr, this.f27009l, iArr);
        } else {
            C10924l.amazon(fArr);
            AbstractC1051l.ads(this, fArr, this.f27033l, iArr);
        }
        AbstractC6745l.mopub(fArr, this.f27076l);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int isPro(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iM3777volatile;
        C2703l c2703l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        C6718l c6718l;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        C2703l c2703l2;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l3 = this;
        viewTreeObserverOnGlobalLayoutListenerC13840l3.removeCallbacks(viewTreeObserverOnGlobalLayoutListenerC13840l3.f27073l);
        try {
            appmetrica(motionEvent);
            viewTreeObserverOnGlobalLayoutListenerC13840l3.f27014l = true;
            viewTreeObserverOnGlobalLayoutListenerC13840l3.tapsense(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC13840l3.f27000l;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                C18480l c18480l = viewTreeObserverOnGlobalLayoutListenerC13840l3.f27032l;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = this;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                    if (motionEvent3 != null) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        c6718l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27075l;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        c6718l.crashlytics.delete(pointerId);
                                        c6718l.loadAd.delete(pointerId);
                                    }
                                    c2703l2 = (C2703l) c18480l.f36088l;
                                    if (c2703l2.amazon) {
                                        c2703l2.amazon = true;
                                    } else {
                                        c2703l2.mopub.yandex.isPro();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        c6718l.crashlytics.delete(pointerId);
                                        c6718l.loadAd.delete(pointerId);
                                    }
                                    c2703l2 = (C2703l) c18480l.f36088l;
                                    if (c2703l2.amazon) {
                                        c2703l2.amazon = true;
                                    } else {
                                        c2703l2.mopub.yandex.isPro();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    c6718l.crashlytics.delete(pointerId);
                                    c6718l.loadAd.delete(pointerId);
                                }
                                c2703l2 = (C2703l) c18480l.f36088l;
                                if (c2703l2.amazon) {
                                    c2703l2.amazon = true;
                                } else {
                                    c2703l2.mopub.yandex.isPro();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    c6718l.crashlytics.delete(pointerId);
                                    c6718l.loadAd.delete(pointerId);
                                }
                                c2703l2 = (C2703l) c18480l.f36088l;
                                if (c2703l2.amazon) {
                                    c2703l2.amazon = true;
                                } else {
                                    c2703l2.mopub.yandex.isPro();
                                }
                            }
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l.m3769native(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM3777volatile = m3777volatile(motionEvent);
                    Trace.endSection();
                    if ((iM3777volatile & 4) != 0) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l2 = this;
                    } else {
                        c2703l = (C2703l) c18480l.f36088l;
                        if (c2703l.amazon) {
                            c2703l.amazon = true;
                        } else {
                            c2703l.mopub.yandex.isPro();
                        }
                        viewTreeObserverOnGlobalLayoutListenerC13840l2 = this;
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.m3769native(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    viewTreeObserverOnGlobalLayoutListenerC13840l2.f27014l = false;
                    return iM3777volatile;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!c18480l.f36085l) {
                            ((C3994l) ((C7026l) c18480l.f36087l).f14720l).loadAd();
                            ((C2703l) c18480l.f36088l).crashlytics();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC13840l3.m3769native(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !metrica(motionEvent)) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = this;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = this;
                        viewTreeObserverOnGlobalLayoutListenerC13840l.m3769native(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        c6718l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27075l;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        c6718l.crashlytics.delete(pointerId);
                                        c6718l.loadAd.delete(pointerId);
                                    }
                                    c2703l2 = (C2703l) c18480l.f36088l;
                                    if (c2703l2.amazon) {
                                        c2703l2.amazon = true;
                                    } else {
                                        c2703l2.mopub.yandex.isPro();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            c6718l.crashlytics.delete(pointerId);
                            c6718l.loadAd.delete(pointerId);
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l.m3769native(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM3777volatile = m3777volatile(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iM3777volatile & 4) != 0 && z3) {
                            c2703l = (C2703l) c18480l.f36088l;
                            if (c2703l.amazon) {
                                c2703l.amazon = true;
                            } else {
                                c2703l.mopub.yandex.isPro();
                            }
                            viewTreeObserverOnGlobalLayoutListenerC13840l2 = this;
                            viewTreeObserverOnGlobalLayoutListenerC13840l2.m3769native(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC13840l2 = this;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.f27014l = false;
                        return iM3777volatile;
                    } catch (Throwable th) {
                        th = th;
                        viewTreeObserverOnGlobalLayoutListenerC13840l3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l3.f27014l = false;
        throw th;
    }

    public final void isVip(C3654l c3654l, boolean z, boolean z2) {
        C14070l c14070l = c3654l.f7667l;
        C1958l c1958l = this.f27005l;
        if (!z) {
            c1958l.getClass();
            int iInmobi = AbstractC5020l.inmobi(c14070l.amazon);
            if (iInmobi == 0 || iInmobi == 1 || iInmobi == 2 || iInmobi == 3) {
                return;
            }
            if (iInmobi != 4) {
                C18725l.billing();
                return;
            }
            C3654l c3654lLicense = c3654l.license();
            boolean z3 = c3654lLicense == null || c3654lLicense.m1389private();
            if (!z2) {
                if (c3654l.ads()) {
                    return;
                }
                if (c3654l.adcel() && c3654l.m1389private() == z3 && c3654l.m1389private() == c14070l.startapp.f29322l) {
                    return;
                }
            }
            C14903l c14903l = c14070l.startapp;
            c14903l.f29318l = true;
            c14903l.f29348l = true;
            if (!c3654l.f7684l && c14903l.f29322l && z3) {
                if ((c3654lLicense == null || !c3654lLicense.adcel()) && (c3654lLicense == null || !c3654lLicense.ads())) {
                    c1958l.loadAd.ads(4, c3654l);
                }
                if (c1958l.amazon) {
                    return;
                }
                m3774synchronized(null);
                return;
            }
            return;
        }
        C18449l c18449l = c1958l.loadAd;
        int iInmobi2 = AbstractC5020l.inmobi(c14070l.amazon);
        if (iInmobi2 != 0) {
            if (iInmobi2 == 1) {
                return;
            }
            if (iInmobi2 != 2) {
                if (iInmobi2 == 3) {
                    return;
                }
                if (iInmobi2 != 4) {
                    C18725l.billing();
                    return;
                }
            }
        }
        if ((c14070l.purchase || c14070l.billing) && !z2) {
            return;
        }
        c14070l.billing = true;
        c14070l.mopub = true;
        C14903l c14903l2 = c14070l.startapp;
        c14903l2.f29318l = true;
        c14903l2.f29348l = true;
        if (c3654l.f7684l) {
            return;
        }
        C3654l c3654lLicense2 = c3654l.license();
        if (AbstractC8576l.yandex(c3654l.m1380extends(), Boolean.TRUE) && ((c3654lLicense2 == null || !c3654lLicense2.f7667l.purchase) && (c3654lLicense2 == null || !c3654lLicense2.f7667l.billing))) {
            c18449l.ads(2, c3654l);
        } else if (c3654l.m1389private() && ((c3654lLicense2 == null || !c3654lLicense2.adcel()) && (c3654lLicense2 == null || !c3654lLicense2.ads()))) {
            c18449l.ads(4, c3654l);
        }
        if (c1958l.amazon) {
            return;
        }
        m3774synchronized(null);
    }

    public final boolean license(int i) {
        if (i != 7 && i != 8) {
            Integer numCrashlytics = AbstractC17194l.crashlytics(i);
            if (numCrashlytics == null) {
                throw AbstractC5020l.metrica("Invalid focus direction");
            }
            int iIntValue = numCrashlytics.intValue();
            C6543l c6543lBilling = ((C15552l) getFocusOwner()).billing();
            if (c6543lBilling == null) {
                C8339l.smaato("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numCrashlytics2 = AbstractC17194l.crashlytics(i);
            if (numCrashlytics2 == null) {
                throw AbstractC5020l.metrica("Invalid focus direction");
            }
            int iIntValue2 = numCrashlytics2.intValue();
            C8464l c8464l = AbstractC5573l.metrica(c6543lBilling).f7688l;
            View interopView = c8464l != null ? c8464l.getInteropView() : null;
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC3234l.yandex(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return AbstractC17194l.loadAd(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final boolean metrica(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m3769native(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jSubscription = subscription((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jSubscription >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jSubscription & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.f27032l.metrica(this.f27075l.crashlytics(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC7630l interfaceC7630l;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().m1386native()) {
            getRoot().amazon(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(C15718l.adcel());
        }
        this.f27031l.onViewAttachedToWindow(this);
        if (!this.f27047l) {
            this.f27026l.crashlytics();
        }
        int i = 0;
        this.f27047l = false;
        smaato(getRoot());
        firebase(getRoot());
        getSnapshotObserver().yandex.amazon();
        ViewTreeObserverOnGlobalLayoutListenerC13840l outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            C8339l.smaato("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.m3770package(new C17524l(this, 3));
        C11096l c11096l = this.f27026l;
        c11096l.purchase();
        InterfaceC3177l interfaceC3177l = c11096l.amazon;
        C11096l c11096l2 = this.f27026l;
        c11096l2.purchase();
        InterfaceC0798l interfaceC0798l = c11096l2.billing;
        InterfaceC10091l interfaceC10091l = this.f27044l;
        if (interfaceC3177l == null || interfaceC0798l == null || interfaceC10091l == null) {
            interfaceC7630l = null;
        } else {
            C7502l c7502l = new C7502l(interfaceC0798l.firebase(), new C9912l(14), C12214l.loadAd);
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0225l.class);
            String strBilling = interfaceC1388lLoadAd.billing();
            if (strBilling == null) {
                C8339l.metrica("Local and anonymous classes can not be ViewModels");
                return;
            }
            C0225l c0225l = (C0225l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling));
            int id = ((View) getParent()).getId();
            C16977l c16977l = c0225l.loadAd;
            Object objLoadAd = c16977l.loadAd(id);
            if (objLoadAd == null) {
                objLoadAd = new C12463l(1);
                c16977l.subs(id, objLoadAd);
            }
            C12463l c12463l = (C12463l) objLoadAd;
            Object[] objArr = c12463l.yandex;
            int i2 = c12463l.loadAd;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((C11603l) obj).crashlytics) {
                    break;
                } else {
                    i++;
                }
            }
            C11603l c11603l = (C11603l) obj;
            if (c11603l == null) {
                c11603l = new C11603l();
                c12463l.yandex(c11603l);
            }
            c11603l.crashlytics = true;
            this.f27064l = c11603l;
            interfaceC7630l = c11603l.loadAd;
        }
        if (interfaceC7630l == null) {
            interfaceC7630l = C11485l.f23076l;
        }
        this.f27008l = interfaceC7630l;
        Function1 function1 = this.f27051l;
        if (function1 != null) {
            function1.invoke(this.f27026l);
            this.f27051l = null;
        }
        C11096l c11096l3 = this.f27026l;
        c11096l3.purchase();
        AbstractC6475l abstractC6475lLoadAd = c11096l3.amazon.loadAd();
        abstractC6475lLoadAd.yandex(this);
        abstractC6475lLoadAd.yandex(this.f27078l);
        m3781getInputModeManager().yandex.setValue(new C14505l(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C3294l.yandex.loadAd(this);
        }
        C4580l c4580lM3779getAutofillManager = m3779getAutofillManager();
        if (c4580lM3779getAutofillManager != null) {
            ((C15552l) getFocusOwner()).mopub.yandex(c4580lM3779getAutofillManager);
            getSemanticsOwner().amazon.yandex(c4580lM3779getAutofillManager);
        }
        ((C15552l) getFocusOwner()).mopub.yandex(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C11532l c11532l = (C11532l) this.f27074l.get();
        C12095l c12095l = (C12095l) (c11532l != null ? c11532l.loadAd : null);
        if (c12095l == null) {
            return getLegacyTextInputServiceAndroid().amazon;
        }
        C11532l c11532l2 = (C11532l) c12095l.f24023l.get();
        C11195l c11195l = (C11195l) (c11532l2 != null ? c11532l2.loadAd : null);
        return c11195l != null && (c11195l.purchase ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3766extends(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection c2903l;
        int i;
        C11532l c11532l = (C11532l) this.f27074l.get();
        C12095l c12095l = (C12095l) (c11532l != null ? c11532l.loadAd : null);
        int i2 = 22;
        if (c12095l != null) {
            C11532l c11532l2 = (C11532l) c12095l.f24023l.get();
            C11195l c11195l = (C11195l) (c11532l2 != null ? c11532l2.loadAd : null);
            if (c11195l == null) {
                return null;
            }
            synchronized (c11195l.crashlytics) {
                if (c11195l.purchase) {
                    return null;
                }
                InputConnection inputConnectionYandex = c11195l.yandex.yandex(editorInfo);
                C3006l c3006l = new C3006l(i2, c11195l);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    c2903l = new C1155l(inputConnectionYandex, c3006l);
                } else if (i3 >= 25) {
                    c2903l = new C10374l(inputConnectionYandex, c3006l);
                } else {
                    c2903l = i3 >= 24 ? new C2903l(inputConnectionYandex, c3006l) : new InputConnectionC7023l(inputConnectionYandex, c3006l);
                }
                c11195l.amazon.crashlytics(new C4059l(c2903l));
                return c2903l;
            }
        }
        C8483l legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.amazon) {
            return null;
        }
        C14966l c14966l = legacyTextInputServiceAndroid.admob;
        C0639l c0639l = legacyTextInputServiceAndroid.mopub;
        int i4 = c14966l.purchase;
        boolean z = c14966l.yandex;
        if (i4 == 1) {
            i = z ? 6 : 0;
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                C8339l.smaato("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i5 = c14966l.amazon;
        if (i5 == 1) {
            editorInfo.inputType = 1;
        } else if (i5 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i5 == 3) {
            editorInfo.inputType = 2;
        } else if (i5 == 4) {
            editorInfo.inputType = 3;
        } else if (i5 == 5) {
            editorInfo.inputType = 17;
        } else if (i5 == 6) {
            editorInfo.inputType = 33;
        } else if (i5 == 7) {
            editorInfo.inputType = 129;
        } else if (i5 == 8) {
            editorInfo.inputType = 18;
        } else if (i5 == 9) {
            editorInfo.inputType = 8194;
        } else if (i5 == 10) {
            editorInfo.inputType = 145;
        } else if (i5 == 11) {
            editorInfo.inputType = 113;
        } else if (i5 == 12) {
            editorInfo.inputType = 97;
        } else if (i5 == 13) {
            editorInfo.inputType = 49;
        } else if (i5 == 14) {
            editorInfo.inputType = 65;
        } else if (i5 == 15) {
            editorInfo.inputType = 81;
        } else if (i5 == 16) {
            editorInfo.inputType = 177;
        } else if (i5 == 17) {
            editorInfo.inputType = 193;
        } else if (i5 == 18) {
            editorInfo.inputType = 4;
        } else if (i5 == 19) {
            editorInfo.inputType = 20;
        } else if (i5 == 20) {
            editorInfo.inputType = 36;
        } else if (i5 == 21) {
            editorInfo.inputType = 4098;
        } else if (i5 == 22) {
            editorInfo.inputType = 12290;
        } else if (i5 == 23) {
            editorInfo.inputType = 8210;
        } else if (i5 == 24) {
            editorInfo.inputType = 4114;
        } else {
            if (i5 != 25) {
                C8339l.smaato("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 12306;
        }
        if (!z) {
            int i6 = editorInfo.inputType;
            if ((i6 & 15) == 1) {
                editorInfo.inputType = i6 | 131072;
                if (i4 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i7 = editorInfo.inputType;
        if ((i7 & 15) == 1) {
            int i8 = c14966l.loadAd;
            if (i8 == 1) {
                editorInfo.inputType = i7 | 4096;
            } else if (i8 == 2) {
                editorInfo.inputType = i7 | 8192;
            } else if (i8 == 3) {
                editorInfo.inputType = i7 | 16384;
            }
            if (c14966l.crashlytics) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = c0639l.loadAd;
        int i9 = C12814l.crashlytics;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC0170l.billing(editorInfo, c0639l.yandex.f7563l);
        editorInfo.imeOptions |= 33554432;
        if (C12304l.amazon()) {
            C12304l.yandex().subs(editorInfo);
        }
        InputConnectionC17176l inputConnectionC17176l = new InputConnectionC17176l(legacyTextInputServiceAndroid.mopub, new C16543l(28, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.admob.crashlytics);
        legacyTextInputServiceAndroid.subs.add(new WeakReference(inputConnectionC17176l));
        return inputConnectionC17176l;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = this.f27078l;
        viewOnAttachStateChangeListenerC0348l.getClass();
        AbstractC12148l.isVip(viewOnAttachStateChangeListenerC0348l, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f27031l.onViewDetachedFromWindow(this);
        View view = this.f27066l;
        if (remoteconfig() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C12463l c12463l = f26990l;
            synchronized (c12463l) {
                c12463l.smaato(this);
                Unit unit = Unit.INSTANCE;
            }
        }
        this.f27026l.loadAd();
        C0298l c0298l = getSnapshotObserver().yandex;
        C4568l c4568l = c0298l.admob;
        if (c4568l != null) {
            c4568l.crashlytics();
        }
        c0298l.yandex();
        C11096l c11096l = this.f27026l;
        c11096l.purchase();
        AbstractC6475l abstractC6475lLoadAd = c11096l.amazon.loadAd();
        abstractC6475lLoadAd.loadAd(this.f27078l);
        abstractC6475lLoadAd.loadAd(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C11603l c11603l = this.f27064l;
        if (c11603l != null) {
            c11603l.crashlytics = false;
        }
        this.f27064l = null;
        if (i >= 31) {
            C3294l.yandex.yandex(this);
        }
        C4580l c4580lM3779getAutofillManager = m3779getAutofillManager();
        if (c4580lM3779getAutofillManager != null) {
            getSemanticsOwner().amazon.smaato(c4580lM3779getAutofillManager);
            ((C15552l) getFocusOwner()).mopub.smaato(c4580lM3779getAutofillManager);
        }
        C0151l rectManager = getRectManager();
        rectManager.mopub = rectManager.amazon.crashlytics(0L, 0L, null, 0, 0);
        getRectManager().yandex();
        C0151l rectManager2 = getRectManager();
        RunnableC0037l runnableC0037l = rectManager2.subs;
        if (runnableC0037l != null) {
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = rectManager2.loadAd;
            if (!AbstractC2812l.advert(runnableC0037l)) {
                runnableC0037l = null;
            }
            if (runnableC0037l != null) {
                viewTreeObserverOnGlobalLayoutListenerC13840l.removeCallbacks(runnableC0037l);
            }
            rectManager2.subs = null;
        }
        ((C15552l) getFocusOwner()).mopub.smaato(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C15552l c15552l = (C15552l) getFocusOwner();
        AbstractC12225l.isPro(c15552l.crashlytics, true);
        if (c15552l.billing() != null) {
            C6543l c6543lBilling = c15552l.billing();
            c15552l.subs(null);
            if (c6543lBilling != null) {
                c6543lBilling.m2027l(EnumC11822l.f23651l, EnumC11822l.f23653l);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f27016l = 0L;
        m3767for();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m3766extends(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f27016l = 0L;
            this.f27005l.remoteconfig(this.f27036l);
            this.f27017l = null;
            m3767for();
            C8697l c8697l = this.f27002l;
            if (c8697l != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    c8697l.layout(0, 0, i3 - i, i4 - i2);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C1958l c1958l = this.f27005l;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().m1386native()) {
                getRoot().amazon(this);
            }
            if (!isAttachedToWindow()) {
                smaato(getRoot());
            }
            long jBilling = billing(i);
            long jBilling2 = billing(i2);
            long jPurchase = AbstractC13628l.purchase((int) (jBilling >>> 32), (int) (jBilling & 4294967295L), (int) (jBilling2 >>> 32), (int) (4294967295L & jBilling2));
            C15519l c15519l = this.f27017l;
            if (c15519l == null) {
                this.f27017l = new C15519l(jPurchase);
                this.f27021l = false;
            } else if (!C15519l.loadAd(c15519l.yandex, jPurchase)) {
                this.f27021l = true;
            }
            c1958l.tapsense(jPurchase);
            c1958l.metrica();
            setMeasuredDimension(getRoot().f7667l.startapp.f20592l, getRoot().f7667l.startapp.f20591l);
            C8697l c8697l = this.f27002l;
            if (c8697l != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    c8697l.measure(View.MeasureSpec.makeMeasureSpec(getRoot().f7667l.startapp.f20592l, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f7667l.startapp.f20591l, 1073741824));
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!amazon() || viewStructure == null || this.f27028l) {
            return;
        }
        premium(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        InterfaceC11325l interfaceC11325l;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC11325l = ((C11351l) getPointerIconService()).yandex) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC11325l instanceof C17150l ? PointerIcon.getSystemIcon(context, ((C17150l) interfaceC11325l).loadAd) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // defpackage.InterfaceC18325l
    public final void onResume(InterfaceC3177l interfaceC3177l) {
        InterfaceC3263l interfaceC3263lSubscription;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(C15718l.adcel());
        }
        C11603l c11603l = this.f27064l;
        if (c11603l != null) {
            InterfaceC10091l interfaceC10091l = this.f27044l;
            C3316l c3316l = c11603l.yandex;
            C3103l c3103l = (C3103l) c3316l.f7072l;
            if (!c3103l.f6646l || c3103l.f6644l) {
                return;
            }
            try {
                interfaceC3263lSubscription = ((C0596l) interfaceC10091l).f2024l.subscription(new C11029l(11, c11603l));
            } catch (CancellationException unused) {
                C3103l c3103l2 = (C3103l) c3316l.f7072l;
                if (!c3103l2.f6645l) {
                    if (c3103l2.f6644l) {
                        AbstractC16941l.yandex("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3103l2.yandex();
                    c3103l2.f6644l = true;
                }
                interfaceC3263lSubscription = null;
            }
            InterfaceC3263l interfaceC3263l = c11603l.amazon;
            if (interfaceC3263l != null) {
                interfaceC3263l.cancel();
            }
            c11603l.amazon = interfaceC3263lSubscription;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        EnumC9931l enumC9931l;
        if (this.f27007l) {
            int[] iArr = AbstractC17194l.yandex;
            EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
            if (i != 0) {
                enumC9931l = i != 1 ? null : EnumC9931l.f20222l;
            } else {
                enumC9931l = enumC9931l2;
            }
            if (enumC9931l != null) {
                enumC9931l2 = enumC9931l;
            }
            setLayoutDirection(enumC9931l2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C17240l c17240l;
        if (Build.VERSION.SDK_INT < 31 || (c17240l = this.f27072l) == null) {
            return;
        }
        c17240l.mopub(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m3767for();
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        C11603l c11603l = this.f27064l;
        if (c11603l != null) {
            C3103l c3103l = (C3103l) c11603l.yandex.f7072l;
            if (c3103l.f6646l && !c3103l.f6644l) {
                InterfaceC3263l interfaceC3263l = c11603l.amazon;
                if (interfaceC3263l != null) {
                    interfaceC3263l.cancel();
                }
                c11603l.amazon = null;
                return;
            }
            if (c3103l.f6645l) {
                return;
            }
            if (!c3103l.f6644l) {
                AbstractC16941l.yandex("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c3103l.f6647l.subs()) {
                AbstractC16941l.yandex("Attempted to start retaining exited values with pending exited values");
            }
            c3103l.f6644l = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        m3781getInputModeManager().yandex.setValue(new C14505l(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = this.f27078l;
        viewOnAttachStateChangeListenerC0348l.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC8576l.yandex(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC12148l.mopub(viewOnAttachStateChangeListenerC0348l, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0348l.f1406l.post(new RunnableC7762l(viewOnAttachStateChangeListenerC0348l, longSparseArray, 2));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zAdcel;
        this.f27062l = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zAdcel = C15718l.adcel())) {
            return;
        }
        setShowLayoutBounds(zAdcel);
        firebase(getRoot());
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3770package(Function0 function0) {
        C11315l c11315l = this.f27013l;
        boolean zIsEmpty = c11315l.isEmpty();
        c11315l.addLast(function0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.f27061l);
            } else {
                C8339l.metrica("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    public final void premium(ViewStructure viewStructure) {
        C4580l c4580lM3779getAutofillManager = m3779getAutofillManager();
        if (c4580lM3779getAutofillManager != null) {
            C3654l c3654l = c4580lM3779getAutofillManager.f9292l.yandex;
            AutofillId autofillId = c4580lM3779getAutofillManager.f9290l;
            String str = c4580lM3779getAutofillManager.f9294l;
            C0151l c0151l = c4580lM3779getAutofillManager.f9295l;
            AbstractC8182l.amazon(viewStructure, c3654l, autofillId, str, c0151l);
            Object[] objArr = AbstractC3626l.yandex;
            C12463l c12463l = new C12463l(2);
            c12463l.yandex(c3654l);
            c12463l.yandex(viewStructure);
            while (c12463l.firebase()) {
                ViewStructure viewStructure2 = (ViewStructure) c12463l.remoteconfig(c12463l.loadAd - 1);
                C4588l c4588l = (C4588l) ((C3654l) c12463l.remoteconfig(c12463l.loadAd - 1)).metrica();
                int i = ((C17893l) c4588l.f9321l).f34846l;
                for (int i2 = 0; i2 < i; i2++) {
                    C3654l c3654l2 = (C3654l) c4588l.get(i2);
                    if (!c3654l2.f7684l && c3654l2.m1386native() && c3654l2.m1389private()) {
                        C6264l c6264lAdvert = c3654l2.advert();
                        if (c6264lAdvert != null) {
                            C13660l c13660l = c6264lAdvert.f13225l;
                            if (c13660l.loadAd(AbstractC16601l.mopub) || c13660l.loadAd(AbstractC16601l.admob) || c13660l.loadAd(AbstractC0424l.ads) || c13660l.loadAd(AbstractC0424l.subscription) || (Build.VERSION.SDK_INT >= 34 && c13660l.loadAd(AbstractC1940l.crashlytics))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                AbstractC8182l.amazon(viewStructureNewChild, c3654l2, c4580lM3779getAutofillManager.f9290l, str, c0151l);
                                c12463l.yandex(c3654l2);
                                c12463l.yandex(viewStructureNewChild);
                            } else {
                                c12463l.yandex(c3654l2);
                                c12463l.yandex(viewStructure2);
                            }
                        } else {
                            c12463l.yandex(c3654l2);
                            c12463l.yandex(viewStructure2);
                        }
                    }
                }
            }
        }
        C5265l c5265lM3778getAutofill = m3778getAutofill();
        if (c5265lM3778getAutofill != null) {
            C6556l c6556l = c5265lM3778getAutofill.loadAd;
            LinkedHashMap linkedHashMap = c6556l.yandex;
            LinkedHashMap linkedHashMap2 = c6556l.yandex;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    C18725l.loadAd();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                AbstractC5941l.m1885else(viewStructureNewChild2, c5265lM3778getAutofill.crashlytics, iIntValue);
                viewStructureNewChild2.setId(iIntValue, c5265lM3778getAutofill.yandex.getContext().getPackageName(), null, null);
                AbstractC5941l.m1879case(viewStructureNewChild2, 1);
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m3771private(Function2 function2, AbstractC0283l abstractC0283l) {
        C12540l c12540l;
        if (abstractC0283l instanceof C12540l) {
            c12540l = (C12540l) abstractC0283l;
            int i = c12540l.f24714l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12540l.f24714l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12540l = new C12540l(this, abstractC0283l);
            }
        } else {
            c12540l = new C12540l(this, abstractC0283l);
        }
        Object obj = c12540l.f24713l;
        int i2 = c12540l.f24714l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13488l c13488l = new C13488l(this, 2);
            c12540l.f24714l = 1;
            if (AbstractC11990l.admob(new C8036l(c13488l, this.f27074l, function2, null, 5), c12540l) == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }

    public final void pro() {
        C12463l c12463l;
        C4580l c4580lM3779getAutofillManager;
        Object[] objArr;
        if (this.f27041l) {
            C0298l c0298l = getSnapshotObserver().yandex;
            synchronized (c0298l.mopub) {
                try {
                    C17893l c17893l = c0298l.billing;
                    int i = c17893l.f34846l;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = c17893l.f34848l;
                        if (i2 >= i) {
                            break;
                        }
                        C8080l c8080l = (C8080l) objArr[i2];
                        c8080l.amazon();
                        if (!c8080l.billing.isPro()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c17893l.f34848l;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    c17893l.f34846l = i4;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f27041l = false;
        }
        C8697l c8697l = this.f27002l;
        if (c8697l != null) {
            purchase(c8697l);
        }
        if (amazon() && (c4580lM3779getAutofillManager = m3779getAutofillManager()) != null) {
            C4622l c4622l = c4580lM3779getAutofillManager.f9291l;
            if (c4622l.amazon == 0 && c4580lM3779getAutofillManager.f9296l) {
                c4580lM3779getAutofillManager.f9293l.yandex();
                c4580lM3779getAutofillManager.f9296l = false;
            }
            if (c4622l.amazon != 0) {
                c4580lM3779getAutofillManager.f9296l = true;
            }
        }
        while (this.f27049l.firebase() && this.f27049l.admob(0) != null) {
            int i5 = this.f27049l.loadAd;
            int i6 = 0;
            while (true) {
                c12463l = this.f27049l;
                if (i6 < i5) {
                    Function0 function0 = (Function0) c12463l.admob(i6);
                    this.f27049l.startapp(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            c12463l.vip(0, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            C3475l c3475lAmazon = AbstractC17194l.amazon(i);
            int i2 = c3475lAmazon != null ? c3475lAmazon.yandex : 7;
            Boolean boolPurchase = ((C15552l) getFocusOwner()).purchase(i2, rect != null ? AbstractC5833l.smaato(rect) : null, new C15798l(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC8576l.yandex(boolPurchase, bool)) {
                if (!AbstractC8576l.yandex(((C15552l) getFocusOwner()).purchase(i2, null, new C15798l(i2, 1)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((C15552l) getFocusOwner()).admob(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f27003l.f19712l = j;
    }

    public final void setAndroidViewsHandler(C8697l c8697l) {
        this.f27002l = c8697l;
    }

    public final void setComposeViewContext(C11096l c11096l) {
        C11096l c11096l2 = this.f27026l;
        if (c11096l == c11096l2) {
            return;
        }
        if (isAttachedToWindow()) {
            c11096l2.loadAd();
            c11096l.crashlytics();
        }
        this.f27026l = c11096l;
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f27047l = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f27060l.setValue(configuration);
    }

    public void setCoroutineContext(InterfaceC12932l interfaceC12932l) {
        this.f27004l = interfaceC12932l;
    }

    public final void setFrameEndScheduler$ui(InterfaceC10091l interfaceC10091l) {
        this.f27044l = interfaceC10091l;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f27016l = j;
    }

    public final void setOnReadyForComposition(Function1<? super C11096l, Unit> function1) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f27047l) {
            function1.invoke(this.f27026l);
        } else {
            this.f27051l = function1;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(Function2<? super C3475l, ? super Boolean, Unit> function2) {
        this.f27038l = function2;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m3772setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C3272l c3272l) {
        this.f27045l = c3272l;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f27019l = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC1233l interfaceC1233l) {
        this.f27005l.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void signatures() {
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = this.f27003l;
        viewOnAttachStateChangeListenerC9659l.f19723l = true;
        Handler handler = viewOnAttachStateChangeListenerC9659l.f19728l.getHandler();
        if (handler != null && viewOnAttachStateChangeListenerC9659l.Signature() && !viewOnAttachStateChangeListenerC9659l.f19725l) {
            viewOnAttachStateChangeListenerC9659l.f19725l = true;
            handler.post(viewOnAttachStateChangeListenerC9659l.f19706l);
        }
        ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = this.f27078l;
        viewOnAttachStateChangeListenerC0348l.f1403l = true;
        viewOnAttachStateChangeListenerC0348l.amazon();
    }

    public final void smaato(C3654l c3654l) {
        this.f27005l.subscription(c3654l, false);
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            smaato((C3654l) objArr[i2]);
        }
    }

    public final boolean startapp(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f27000l) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final long m3773strictfp(long j) {
        applovin();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f27037l >> 32));
        return C10924l.loadAd((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f27037l & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f27076l);
    }

    public final void subs(C3654l c3654l, boolean z) {
        this.f27005l.admob(c3654l, z);
    }

    public final long subscription(long j) {
        applovin();
        long jLoadAd = C10924l.loadAd(j, this.f27069l);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f27037l >> 32)) + Float.intBitsToFloat((int) (jLoadAd >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f27037l & 4294967295L)) + Float.intBitsToFloat((int) (jLoadAd & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m3774synchronized(C3654l c3654l) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c3654l != null) {
            while (c3654l != null && c3654l.subscription() == 1) {
                if (!this.f27021l) {
                    C3654l c3654lLicense = c3654l.license();
                    if (c3654lLicense == null) {
                        break;
                    }
                    long j = ((C11103l) c3654lLicense.f7703l.amazon).f20594l;
                    if (C15519l.billing(j) && C15519l.purchase(j)) {
                        break;
                    }
                }
                c3654l = c3654l.license();
            }
            if (c3654l == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void tapsense(boolean z) {
        C1958l c1958l = this.f27005l;
        if (c1958l.loadAd.m4540else() || ((C17893l) c1958l.purchase.f35934l).f34846l != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (c1958l.remoteconfig(z ? this.f27036l : this.f27068l)) {
                    requestLayout();
                }
                c1958l.crashlytics(false);
                getRectManager().yandex();
                if (this.f27053l) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f27053l = false;
                }
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m3775throw(float f) {
        if (remoteconfig()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f27063l) || f > this.f27063l) {
                    this.f27063l = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f27018l) || f < this.f27018l) {
                    this.f27018l = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m3776throws() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final int m3777volatile(MotionEvent motionEvent) {
        Object obj;
        if (this.f27062l) {
            this.f27062l = false;
            C12771l c12771l = this.f27026l.tapsense;
            int metaState = motionEvent.getMetaState();
            c12771l.getClass();
            AbstractC10896l.yandex.setValue(new C1000l(metaState));
        }
        C6718l c6718l = this.f27075l;
        C13568l c13568lCrashlytics = c6718l.crashlytics(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C18480l c18480l = this.f27032l;
        if (c13568lCrashlytics == null) {
            if (!c18480l.f36085l) {
                ((C3994l) ((C7026l) c18480l.f36087l).f14720l).loadAd();
                ((C2703l) c18480l.f36088l).crashlytics();
            }
            return 0;
        }
        List list = (List) c13568lCrashlytics.f26581l;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((C0704l) obj).purchase && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        C0704l c0704l = (C0704l) obj;
        if (c0704l != null) {
            this.f27025l = c0704l.amazon;
        }
        int iMetrica = c18480l.metrica(c13568lCrashlytics, this, metrica(motionEvent));
        c13568lCrashlytics.f26580l = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iMetrica & 1) != 0) {
            return iMetrica;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c6718l.crashlytics.delete(pointerId);
        c6718l.loadAd.delete(pointerId);
        return iMetrica;
    }

    @Override // defpackage.InterfaceC8504l
    public final void yandex(C6543l c6543l, C6543l c6543l2) {
        C18289l c18289l;
        boolean z;
        C18289l c18289l2;
        boolean z2;
        if (c6543l != null) {
            C6543l c6543l3 = c6543l;
            if (!c6543l3.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
            }
            AbstractC14971l abstractC14971l = c6543l3.f29454l;
            C3654l c3654lMetrica = AbstractC5573l.metrica(c6543l);
            C6295l c6295l = null;
            ArrayList arrayList = null;
            while (c3654lMetrica != null) {
                if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 2097152) != 0) {
                    while (abstractC14971l != null) {
                        if ((abstractC14971l.f29450l & 2097152) != 0) {
                            AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                            C17893l c17893l = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof InterfaceC17612l) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC14971lLoadAd);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC14971lLoadAd.f29450l & 2097152) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i = 0;
                                    for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                        if ((abstractC14971l2.f29450l & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC14971lLoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l == null) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l.crashlytics(abstractC14971l2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                        abstractC14971l = abstractC14971l.f29456l;
                    }
                }
                c3654lMetrica = c3654lMetrica.license();
                abstractC14971l = (c3654lMetrica == null || (c18289l2 = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l2.billing;
            }
            if (arrayList == null) {
                return;
            }
            if (c6543l2 != null) {
                if (!c6543l2.f29454l.f29462l) {
                    AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                }
                AbstractC14971l abstractC14971l3 = c6543l2.f29454l;
                C3654l c3654lMetrica2 = AbstractC5573l.metrica(c6543l2);
                C6295l c6295l2 = null;
                while (c3654lMetrica2 != null) {
                    if ((((AbstractC14971l) c3654lMetrica2.f7703l.mopub).f29457l & 2097152) != 0) {
                        while (abstractC14971l3 != null) {
                            if ((abstractC14971l3.f29450l & 2097152) != 0) {
                                AbstractC14971l abstractC14971lLoadAd2 = abstractC14971l3;
                                C17893l c17893l2 = null;
                                while (abstractC14971lLoadAd2 != null) {
                                    if (abstractC14971lLoadAd2 instanceof InterfaceC17612l) {
                                        if (c6295l2 == null) {
                                            C6295l c6295l3 = AbstractC13087l.yandex;
                                            c6295l2 = new C6295l();
                                        }
                                        c6295l2.yandex(abstractC14971lLoadAd2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC14971lLoadAd2.f29450l & 2097152) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                        int i2 = 0;
                                        for (AbstractC14971l abstractC14971l4 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l4 != null; abstractC14971l4 = abstractC14971l4.f29460l) {
                                            if ((abstractC14971l4.f29450l & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC14971lLoadAd2 = abstractC14971l4;
                                                } else {
                                                    if (c17893l2 == null) {
                                                        c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                    }
                                                    if (abstractC14971lLoadAd2 != null) {
                                                        c17893l2.crashlytics(abstractC14971lLoadAd2);
                                                        abstractC14971lLoadAd2 = null;
                                                    }
                                                    c17893l2.crashlytics(abstractC14971l4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l2);
                                }
                            }
                            abstractC14971l3 = abstractC14971l3.f29456l;
                        }
                    }
                    c3654lMetrica2 = c3654lMetrica2.license();
                    abstractC14971l3 = (c3654lMetrica2 == null || (c18289l = c3654lMetrica2.f7703l) == null) ? null : (C13924l) c18289l.billing;
                }
                c6295l = c6295l2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC17612l interfaceC17612l = (InterfaceC17612l) arrayList.get(i3);
                if (!(c6295l != null ? c6295l.crashlytics(interfaceC17612l) : false)) {
                    interfaceC17612l.mo1985try();
                }
            }
        }
    }

    /* JADX INFO: renamed from: getAutofill, reason: merged with bridge method [inline-methods] */
    public C5265l m3778getAutofill() {
        return this.f27067l;
    }

    /* JADX INFO: renamed from: getAutofillManager, reason: merged with bridge method [inline-methods] */
    public C4580l m3779getAutofillManager() {
        return this.f27022l;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC13486l m3780getDragAndDropManager() {
        return this.f27071l;
    }

    public C16977l getLayoutNodes() {
        return this.f27030l;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC2724l
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m3765getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @InterfaceC2724l
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public InterfaceC6313l getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onDestroy(InterfaceC3177l interfaceC3177l) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStart(InterfaceC3177l interfaceC3177l) {
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC1233l interfaceC1233l) {
    }
}
