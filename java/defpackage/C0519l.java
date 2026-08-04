package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0519l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f1837l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f1838l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f1839l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f1840l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f1841l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519l(Context context, boolean z, InterfaceC2262l interfaceC2262l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1837l = context;
        this.f1841l = z;
        this.f1838l = interfaceC2262l;
        this.f1840l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        VKXApplication vKXApplication;
        C17464l c17464l;
        List list;
        C13708l c13708l;
        String str;
        Uri uri;
        C17805l c17805l;
        int i2 = this.f1839l;
        int i3 = 2;
        boolean z = this.f1841l;
        Object obj2 = this.f1840l;
        Object obj3 = this.f1838l;
        int i4 = 4;
        byte b = 0;
        switch (i2) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                Handler handler = new Handler(Looper.getMainLooper());
                int i5 = AbstractC2950l.yandex;
                Context context = (Context) this.f1837l;
                MaterialCardView materialCardView = new MaterialCardView(context);
                materialCardView.setCardBackgroundColor(AbstractC13209l.yandex(R.attr.bg_primary));
                materialCardView.setElevation(0.0f);
                materialCardView.setCardElevation(0.0f);
                VKXApplication.Companion companion = VKXApplication.f36628l;
                materialCardView.setRadius(VKXApplication.Companion.yandex(8.0f));
                int i6 = AbstractC2950l.yandex;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i6);
                layoutParams.gravity = 17;
                materialCardView.setLayoutParams(layoutParams);
                FrameLayout frameLayout = new FrameLayout(context);
                C4520l c4520l = new C4520l(context);
                c4520l.setIndeterminate(true);
                c4520l.setIndicatorSize(AbstractC2950l.crashlytics);
                c4520l.setIndicatorColor(AbstractC13209l.yandex(R.attr.global_accent));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams2.gravity = 17;
                Unit unit = Unit.INSTANCE;
                frameLayout.addView(c4520l, layoutParams2);
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                int i7 = AbstractC2950l.loadAd;
                appCompatImageView.setPadding(i7, i7, i7, i7);
                appCompatImageView.setImageResource(R.drawable.ic_close);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC13209l.yandex(R.attr.text_secondary)));
                appCompatImageView.setVisibility(8);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams3.gravity = 17;
                frameLayout.addView(appCompatImageView, layoutParams3);
                materialCardView.addView(frameLayout);
                C8195l c8195l = new C8195l(materialCardView, appCompatImageView);
                C10700l c10700l = new C10700l();
                DialogC0230l dialogC0230l = new DialogC0230l(context, R.style.TransparentDialog);
                dialogC0230l.setContentView(materialCardView);
                dialogC0230l.setCancelable(false);
                dialogC0230l.setCanceledOnTouchOutside(false);
                int i8 = AbstractC5852l.yandex;
                Window window = dialogC0230l.getWindow();
                if (window == null) {
                    C8339l.smaato("This shouldn't be possible!");
                    return null;
                }
                AbstractC2829l.yandex(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                if (!z) {
                    appCompatImageView.setOnClickListener(new ViewOnClickListenerC11062l(c10700l, handler, dialogC0230l, 0));
                    handler.postDelayed(new RunnableC16112l(4, c8195l), 1500L);
                }
                c10700l.f21708l = AbstractC10999l.mopub((InterfaceC2262l) obj3, new C18431l(handler, dialogC0230l, 0), 0, new C1914l(dialogC0230l, (Function2) obj2, handler, c10700l, (InterfaceC14029l) null, 1), 2);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                if (z) {
                    C7721l c7721l = (C7721l) this.f1837l;
                    C15308l c15308l = c7721l.f16199l;
                    C15308l c15308l2 = c7721l.f16211l;
                    AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj3;
                    AudioTrack audioTrack = (AudioTrack) audioSnippetEntry.mopub.get(((C2887l) obj2).metrica());
                    ListIterator listIterator = c7721l.f16203l.listIterator();
                    int i9 = 0;
                    while (true) {
                        C13376l c13376l = (C13376l) listIterator;
                        i = -1;
                        if (!c13376l.hasNext()) {
                            i9 = -1;
                        } else if (!AbstractC8576l.yandex(((AudioSnippetEntry) c13376l.next()).billing, audioSnippetEntry.billing)) {
                            i9++;
                        }
                    }
                    Iterator it = audioSnippetEntry.mopub.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        if (AbstractC8576l.yandex((AudioTrack) it.next(), audioTrack)) {
                            i = i10;
                            if (c15308l2.admob() == i9 || c15308l.admob() != i) {
                                c15308l2.subs(i9);
                                c15308l.subs(i);
                                C18396l c18396l = c7721l.f16200l;
                                vKXApplication = VKXApplication.f36631l;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                c18396l.m4530volatile(vKXApplication.getApplicationContext());
                                C17804l c17804lM2209this = c7721l.m2209this();
                                C0935l c0935l = new C0935l();
                                c17464l = new C17464l();
                                list = Collections.EMPTY_LIST;
                                c13708l = C13708l.f26763l;
                                C2410l c2410l = new C2410l();
                                C11470l c11470l = C11470l.amazon;
                                audioTrack.getClass();
                                String strBilling = AbstractC16676l.billing(audioTrack);
                                str = audioTrack.isPro;
                                if (str == null) {
                                    uri = null;
                                } else {
                                    uri = Uri.parse(str);
                                }
                                AbstractC12442l.subscription((((Uri) c17464l.purchase) == null && ((UUID) c17464l.amazon) == null) ? false : true);
                                if (uri != null) {
                                    c17805l = new C17805l(uri, null, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, c13708l, null, -9223372036854775807L);
                                } else {
                                    c17805l = null;
                                }
                                c17804lM2209this.mo2776l(new C2427l(strBilling, new C9202l(c0935l), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l));
                                c7721l.m2209this().yandex();
                                c7721l.m2209this().mo2753continue(true);
                            }
                        } else {
                            i10++;
                        }
                    }
                    if (c15308l2.admob() == i9) {
                        c15308l2.subs(i9);
                        c15308l.subs(i);
                        C18396l c18396l2 = c7721l.f16200l;
                        vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        c18396l2.m4530volatile(vKXApplication.getApplicationContext());
                        C17804l c17804lM2209this2 = c7721l.m2209this();
                        C0935l c0935l2 = new C0935l();
                        c17464l = new C17464l();
                        list = Collections.EMPTY_LIST;
                        c13708l = C13708l.f26763l;
                        C2410l c2410l2 = new C2410l();
                        C11470l c11470l2 = C11470l.amazon;
                        audioTrack.getClass();
                        String strBilling2 = AbstractC16676l.billing(audioTrack);
                        str = audioTrack.isPro;
                        if (str == null) {
                            uri = null;
                        } else {
                            uri = Uri.parse(str);
                        }
                        AbstractC12442l.subscription((((Uri) c17464l.purchase) == null && ((UUID) c17464l.amazon) == null) ? false : true);
                        if (uri != null) {
                            c17805l = new C17805l(uri, null, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, c13708l, null, -9223372036854775807L);
                        } else {
                            c17805l = null;
                        }
                        c17804lM2209this2.mo2776l(new C2427l(strBilling2, new C9202l(c0935l2), c17805l, new C7828l(c2410l2), C3852l.f7980private, c11470l2));
                        c7721l.m2209this().yandex();
                        c7721l.m2209this().mo2753continue(true);
                    } else {
                        c15308l2.subs(i9);
                        c15308l.subs(i);
                        C18396l c18396l3 = c7721l.f16200l;
                        vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        c18396l3.m4530volatile(vKXApplication.getApplicationContext());
                        C17804l c17804lM2209this3 = c7721l.m2209this();
                        C0935l c0935l3 = new C0935l();
                        c17464l = new C17464l();
                        list = Collections.EMPTY_LIST;
                        c13708l = C13708l.f26763l;
                        C2410l c2410l3 = new C2410l();
                        C11470l c11470l3 = C11470l.amazon;
                        audioTrack.getClass();
                        String strBilling3 = AbstractC16676l.billing(audioTrack);
                        str = audioTrack.isPro;
                        if (str == null) {
                            uri = null;
                        } else {
                            uri = Uri.parse(str);
                        }
                        AbstractC12442l.subscription((((Uri) c17464l.purchase) == null && ((UUID) c17464l.amazon) == null) ? false : true);
                        if (uri != null) {
                            c17805l = new C17805l(uri, null, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, c13708l, null, -9223372036854775807L);
                        } else {
                            c17805l = null;
                        }
                        c17804lM2209this3.mo2776l(new C2427l(strBilling3, new C9202l(c0935l3), c17805l, new C7828l(c2410l3), C3852l.f7980private, c11470l3));
                        c7721l.m2209this().yandex();
                        c7721l.m2209this().mo2753continue(true);
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f1837l;
                C12217l c12217l = (C12217l) obj3;
                InterfaceC6843l interfaceC6843l = (InterfaceC6843l) obj2;
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C14317l(c12217l, interfaceC6843l, b == true ? 1 : 0, i4), 1);
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C15916l(interfaceC6843l, c12217l, z, (InterfaceC14029l) null), 1).mo2154l(new C15419l(c12217l, i3));
                return AbstractC10999l.mopub(interfaceC2262l, null, 4, new C15916l(c12217l, interfaceC6843l, z, (InterfaceC14029l) null), 1);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f1839l;
        Object obj2 = this.f1840l;
        Object obj3 = this.f1838l;
        switch (i) {
            case 0:
                return new C0519l((Context) this.f1837l, this.f1841l, (InterfaceC2262l) obj3, (Function2) obj2, interfaceC14029l);
            case 1:
                return new C0519l(this.f1841l, (C7721l) this.f1837l, (AudioSnippetEntry) obj3, (C2887l) obj2, interfaceC14029l);
            default:
                C0519l c0519l = new C0519l((C12217l) obj3, (InterfaceC6843l) obj2, this.f1841l, interfaceC14029l);
                c0519l.f1837l = obj;
                return c0519l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f1839l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0519l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519l(C12217l c12217l, InterfaceC6843l interfaceC6843l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1838l = c12217l;
        this.f1840l = interfaceC6843l;
        this.f1841l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519l(boolean z, C7721l c7721l, AudioSnippetEntry audioSnippetEntry, C2887l c2887l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1841l = z;
        this.f1837l = c7721l;
        this.f1838l = audioSnippetEntry;
        this.f1840l = c2887l;
    }
}
