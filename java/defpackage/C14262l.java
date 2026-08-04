package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14262l implements InterfaceC18325l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15615l f27860l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f27861l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f27862l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10024l f27863l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Activity f27864l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final InterfaceC1220l f27865l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final PopupWindow f27866l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3797l f27867l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC1220l f27868l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final PopupWindow f27869l;

    /* JADX WARN: Multi-variable type inference failed */
    public C14262l(Activity activity, C10024l c10024l) {
        AbstractC6475l abstractC6475lLoadAd;
        this.f27864l = activity;
        this.f27863l = c10024l;
        final int i = 0;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i2 = R.id.balloon_arrow;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.balloon_arrow);
        if (imageView != null) {
            i2 = R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) AbstractC8576l.smaato(viewInflate, R.id.balloon_card);
            if (radiusLayout != null) {
                i2 = R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.balloon_content);
                if (frameLayout2 != null) {
                    i2 = R.id.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) AbstractC8576l.smaato(viewInflate, R.id.balloon_text);
                    if (vectorTextView != null) {
                        i2 = R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.balloon_wrapper);
                        if (frameLayout3 != null) {
                            this.f27860l = new C15615l(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3, 2);
                            View viewInflate2 = LayoutInflater.from(activity).inflate(R.layout.balloon_layout_overlay, (ViewGroup) null, false);
                            if (viewInflate2 == null) {
                                C6541l.subs("rootView");
                                throw null;
                            }
                            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) viewInflate2;
                            this.f27867l = new C3797l(balloonAnchorOverlayView, balloonAnchorOverlayView, 7);
                            PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                            this.f27866l = popupWindow;
                            PopupWindow popupWindow2 = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                            this.f27869l = popupWindow2;
                            this.f27868l = AbstractC9968l.crashlytics(3, new C7703l(6));
                            this.f27865l = AbstractC9968l.crashlytics(3, new C5823l(this, i));
                            AbstractC9968l.crashlytics(3, new C5823l(this, 1));
                            float f = c10024l.pro;
                            float f2 = c10024l.ad;
                            radiusLayout.setAlpha(f);
                            radiusLayout.setRadius(c10024l.ads);
                            radiusLayout.setRadius(c10024l.ads);
                            WeakHashMap weakHashMap = AbstractC15872l.yandex;
                            radiusLayout.setElevation(f2);
                            radiusLayout.setDrawCustomShape(false);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(c10024l.adcel);
                            gradientDrawable.setCornerRadius(c10024l.ads);
                            radiusLayout.setBackground(gradientDrawable);
                            radiusLayout.setBackgroundTintList(null);
                            radiusLayout.setPadding(c10024l.purchase, c10024l.billing, c10024l.mopub, c10024l.admob);
                            ((ViewGroup.MarginLayoutParams) frameLayout3.getLayoutParams()).setMargins(0, 0, 0, 0);
                            frameLayout3.setFocusable(false);
                            frameLayout3.setFocusableInTouchMode(false);
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 26) {
                                frameLayout3.setDefaultFocusHighlightEnabled(false);
                            }
                            frameLayout.setFocusable(false);
                            frameLayout.setFocusableInTouchMode(false);
                            if (i3 >= 26) {
                                frameLayout.setDefaultFocusHighlightEnabled(false);
                            }
                            radiusLayout.setFocusable(false);
                            radiusLayout.setFocusableInTouchMode(false);
                            if (i3 >= 26) {
                                radiusLayout.setDefaultFocusHighlightEnabled(false);
                            }
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(c10024l.f20425else);
                            popupWindow.setClippingEnabled(c10024l.f20423continue);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setElevation(f2);
                            popupWindow.setAttachedInDecor(c10024l.f20435switch);
                            vectorTextView.getContext();
                            AbstractC5573l.ads(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
                            AbstractC5573l.ads(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
                            AbstractC5573l.ads(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
                            boolean z = c10024l.f20437throw;
                            C9675l c9675l = vectorTextView.drawableTextViewParams;
                            if (c9675l != null) {
                                c9675l.purchase = z;
                                AbstractC12396l.loadAd(vectorTextView, c9675l);
                            }
                            vectorTextView.getContext();
                            String str = c10024l.subscription;
                            float f3 = c10024l.Signature;
                            int i4 = c10024l.tapsense;
                            int i5 = c10024l.license;
                            vectorTextView.setMovementMethod(null);
                            vectorTextView.setText(str);
                            vectorTextView.setTextSize(f3);
                            vectorTextView.setGravity(i5);
                            vectorTextView.setTextColor(i4);
                            vectorTextView.setIncludeFontPadding(true);
                            vectorTextView.setTypeface(vectorTextView.getTypeface(), 0);
                            isPro(vectorTextView, radiusLayout);
                            subs();
                            if (c10024l.advert) {
                                balloonAnchorOverlayView.setOverlayColor(c10024l.isVip);
                                balloonAnchorOverlayView.setOverlayPadding(c10024l.signatures);
                                balloonAnchorOverlayView.setOverlayPosition(null);
                                balloonAnchorOverlayView.setBalloonOverlayShape(c10024l.premium);
                                balloonAnchorOverlayView.setOverlayPaddingColor(0);
                                balloonAnchorOverlayView.setOverlayPaddingShader(null);
                                popupWindow2.setClippingEnabled(false);
                            }
                            if (c10024l.f20431package) {
                                final int i6 = 1;
                                frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: lٕؓؕ

                                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                    public final /* synthetic */ C14262l f3924l;

                                    {
                                        this.f3924l = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i7 = i6;
                                        C14262l c14262l = this.f3924l;
                                        switch (i7) {
                                            case 0:
                                                if (c14262l.f27863l.f20436synchronized) {
                                                    c14262l.crashlytics();
                                                }
                                                break;
                                            default:
                                                if (c14262l.f27863l.f20431package) {
                                                    c14262l.crashlytics();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            final C14440l c14440l = c10024l.appmetrica;
                            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: lؘُۘ
                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    C14262l c14262l = this.f12461l;
                                    FrameLayout frameLayout4 = (FrameLayout) c14262l.f27860l.f30480l;
                                    Animation animation = frameLayout4.getAnimation();
                                    if (animation != null) {
                                        animation.cancel();
                                        animation.reset();
                                    }
                                    frameLayout4.clearAnimation();
                                    c14262l.crashlytics();
                                    C14440l c14440l2 = c14440l;
                                    if (c14440l2 != null) {
                                        c14440l2.f28282l.invoke();
                                    }
                                }
                            });
                            popupWindow.setTouchInterceptor(new ViewOnTouchListenerC18374l(i, this));
                            balloonAnchorOverlayView.setOnClickListener(new View.OnClickListener(this) { // from class: lٕؓؕ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ C14262l f3924l;

                                {
                                    this.f3924l = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i7 = i;
                                    C14262l c14262l = this.f3924l;
                                    switch (i7) {
                                        case 0:
                                            if (c14262l.f27863l.f20436synchronized) {
                                                c14262l.crashlytics();
                                            }
                                            break;
                                        default:
                                            if (c14262l.f27863l.f20431package) {
                                                c14262l.crashlytics();
                                            }
                                            break;
                                    }
                                }
                            });
                            yandex(frameLayout);
                            InterfaceC3177l interfaceC3177l = c10024l.f20439volatile;
                            if (interfaceC3177l == null && (activity instanceof InterfaceC3177l)) {
                                InterfaceC3177l interfaceC3177l2 = (InterfaceC3177l) activity;
                                c10024l.f20439volatile = interfaceC3177l2;
                                interfaceC3177l2.loadAd().yandex(this);
                                return;
                            } else {
                                if (interfaceC3177l == null || (abstractC6475lLoadAd = interfaceC3177l.loadAd()) == null) {
                                    return;
                                }
                                abstractC6475lLoadAd.yandex(this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static void yandex(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        C8934l c8934lAdcel = AbstractC8576l.adcel(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
        Iterator it = c8934lAdcel.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                break;
            } else {
                arrayList.add(viewGroup.getChildAt(c16991l.nextInt()));
            }
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                yandex((ViewGroup) view);
            }
        }
    }

    public final int admob() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        C10024l c10024l = this.f27863l;
        float f = c10024l.crashlytics;
        if (f != 0.0f) {
            return (int) (i * f);
        }
        int i2 = c10024l.yandex;
        if (i2 == Integer.MIN_VALUE) {
            int iPurchase = AbstractC8576l.purchase(((FrameLayout) this.f27860l.f30483l).getMeasuredWidth(), 0, c10024l.loadAd);
            if (iPurchase <= i) {
                return iPurchase;
            }
        } else if (i2 <= i) {
            return i2;
        }
        return i;
    }

    public final float amazon(View view) {
        C15615l c15615l = this.f27860l;
        int i = AbstractC6745l.billing((FrameLayout) c15615l.f30487l).x;
        int i2 = AbstractC6745l.billing(view).x;
        C10024l c10024l = this.f27863l;
        float fLoadAd = (c10024l.loadAd() * c10024l.startapp) + 0.0f;
        float fAdmob = ((admob() - fLoadAd) - 0.0f) - 0.0f;
        float fLoadAd2 = c10024l.loadAd() * 0.5f;
        int iInmobi = AbstractC5020l.inmobi(c10024l.f20422class);
        if (iInmobi == 0) {
            return (((FrameLayout) c15615l.f30482l).getWidth() * c10024l.vip) - fLoadAd2;
        }
        if (iInmobi != 1) {
            C18725l.billing();
            return 0.0f;
        }
        if (view.getWidth() + i2 >= i) {
            if (admob() + i >= i2) {
                float f = i2;
                float f2 = i;
                float width = (((view.getWidth() * c10024l.vip) + f) - f2) - fLoadAd2;
                float width2 = ((view.getWidth() * c10024l.vip) + f) - fLoadAd2;
                if (width2 <= f2) {
                    return 0.0f;
                }
                if (width2 > f2 && view.getWidth() <= admob()) {
                    return width2 - f2;
                }
                if (width > c10024l.loadAd() * 2) {
                    if (width <= admob() - (c10024l.loadAd() * 2)) {
                        return width;
                    }
                }
            }
            return fAdmob;
        }
        return fLoadAd;
    }

    public final int billing() {
        int i = this.f27863l.amazon;
        return i != Integer.MIN_VALUE ? i : ((FrameLayout) this.f27860l.f30483l).getMeasuredHeight();
    }

    public final void crashlytics() {
        if (this.f27861l) {
            C5823l c5823l = new C5823l(this, 2);
            C10024l c10024l = this.f27863l;
            if (c10024l.f20433static != 4) {
                c5823l.invoke();
            } else {
                View contentView = this.f27866l.getContentView();
                contentView.post(new RunnableC3094l(contentView, c10024l.f20426extends, c5823l));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    public final void isPro(TextView textView, View view) {
        int intrinsicWidth;
        int compoundPaddingEnd;
        int i;
        C10024l c10024l;
        int i2;
        float f;
        int i3;
        int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        int intrinsicWidth2 = 0;
        if (compoundDrawablesRelative[0] == null && compoundDrawablesRelative[2] == null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (compoundDrawables[0] != null || compoundDrawables[2] != null) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                Drawable drawable = compoundDrawables2[0];
                int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                Drawable drawable2 = compoundDrawables2[2];
                int intrinsicHeight2 = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
                if (intrinsicHeight < intrinsicHeight2) {
                    intrinsicHeight = intrinsicHeight2;
                }
                textView.setMinHeight(intrinsicHeight);
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                Drawable drawable3 = compoundDrawables3[0];
                intrinsicWidth = drawable3 != null ? drawable3.getIntrinsicWidth() : 0;
                Drawable drawable4 = compoundDrawables3[2];
                if (drawable4 != null) {
                    intrinsicWidth2 = drawable4.getIntrinsicWidth();
                }
            }
            compoundPaddingEnd = textView.getCompoundPaddingEnd() + textView.getCompoundPaddingStart() + iMeasureText;
            i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            c10024l = this.f27863l;
            int iLoadAd = (c10024l.loadAd() * 2) + paddingRight;
            i2 = c10024l.loadAd - iLoadAd;
            if (i2 > i) {
                i2 = i;
            }
            f = c10024l.crashlytics;
            if (f == 0.0f) {
                i3 = c10024l.yandex;
                if (i3 != Integer.MIN_VALUE || i3 > i) {
                    if (compoundPaddingEnd > i2) {
                        compoundPaddingEnd = i2;
                    }
                }
                textView.setMaxWidth(compoundPaddingEnd);
            }
            i3 = (int) (i * f);
            compoundPaddingEnd = i3 - iLoadAd;
            textView.setMaxWidth(compoundPaddingEnd);
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        Drawable drawable5 = compoundDrawablesRelative2[0];
        int intrinsicHeight3 = drawable5 != null ? drawable5.getIntrinsicHeight() : 0;
        Drawable drawable6 = compoundDrawablesRelative2[2];
        int intrinsicHeight4 = drawable6 != null ? drawable6.getIntrinsicHeight() : 0;
        if (intrinsicHeight3 < intrinsicHeight4) {
            intrinsicHeight3 = intrinsicHeight4;
        }
        textView.setMinHeight(intrinsicHeight3);
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative3[0];
        intrinsicWidth = drawable7 != null ? drawable7.getIntrinsicWidth() : 0;
        Drawable drawable8 = compoundDrawablesRelative3[2];
        if (drawable8 != null) {
            intrinsicWidth2 = drawable8.getIntrinsicWidth();
        }
        iMeasureText += intrinsicWidth2 + intrinsicWidth;
        compoundPaddingEnd = textView.getCompoundPaddingEnd() + textView.getCompoundPaddingStart() + iMeasureText;
        i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingRight2 = view.getPaddingRight() + view.getPaddingLeft();
        c10024l = this.f27863l;
        int iLoadAd2 = (c10024l.loadAd() * 2) + paddingRight2;
        i2 = c10024l.loadAd - iLoadAd2;
        if (i2 > i) {
            i2 = i;
        }
        f = c10024l.crashlytics;
        if (f == 0.0f) {
            i3 = c10024l.yandex;
            if (i3 != Integer.MIN_VALUE) {
            }
            if (compoundPaddingEnd > i2) {
                compoundPaddingEnd = i2;
            }
            textView.setMaxWidth(compoundPaddingEnd);
        }
        i3 = (int) (i * f);
        compoundPaddingEnd = i3 - iLoadAd2;
        textView.setMaxWidth(compoundPaddingEnd);
    }

    public final boolean loadAd(View view) {
        if (this.f27861l || this.f27862l) {
            return false;
        }
        Activity activityLoadAd = AbstractC9968l.loadAd(this.f27864l);
        if ((activityLoadAd == null || !activityLoadAd.isFinishing()) && this.f27866l.getContentView().getParent() == null && view.isAttachedToWindow()) {
            return view.getWindowToken().isBinderAlive();
        }
        return false;
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        AbstractC6475l abstractC6475lLoadAd;
        this.f27862l = true;
        this.f27869l.dismiss();
        this.f27866l.dismiss();
        InterfaceC3177l interfaceC3177l2 = this.f27863l.f20439volatile;
        if (interfaceC3177l2 == null || (abstractC6475lLoadAd = interfaceC3177l2.loadAd()) == null) {
            return;
        }
        abstractC6475lLoadAd.loadAd(this);
    }

    public final float purchase(View view) {
        int i;
        C10024l c10024l = this.f27863l;
        boolean z = c10024l.f20420case;
        Rect rect = new Rect();
        Activity activityLoadAd = AbstractC9968l.loadAd(view.getContext());
        if (activityLoadAd == null || !z) {
            i = 0;
        } else {
            activityLoadAd.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        }
        C15615l c15615l = this.f27860l;
        int i2 = AbstractC6745l.billing((FrameLayout) c15615l.f30487l).y - i;
        int i3 = AbstractC6745l.billing(view).y - i;
        float fYandex = (c10024l.yandex() * c10024l.startapp) + 0.0f;
        float fBilling = ((billing() - fYandex) - 0.0f) - 0.0f;
        float fYandex2 = c10024l.yandex() * 0.5f;
        int iInmobi = AbstractC5020l.inmobi(c10024l.f20422class);
        if (iInmobi == 0) {
            return (((FrameLayout) c15615l.f30482l).getHeight() * c10024l.vip) - fYandex2;
        }
        if (iInmobi != 1) {
            C18725l.billing();
            return 0.0f;
        }
        if (view.getHeight() + i3 >= i2) {
            if (billing() + i2 >= i3) {
                float height = (((view.getHeight() * c10024l.vip) + i3) - i2) - fYandex2;
                if (height > c10024l.yandex() * 2) {
                    if (height <= billing() - (c10024l.yandex() * 2)) {
                        return height;
                    }
                }
            }
            return fBilling;
        }
        return fYandex;
    }

    public final void subs() {
        C10024l c10024l = this.f27863l;
        int i = (int) c10024l.ad;
        FrameLayout frameLayout = (FrameLayout) this.f27860l.f30487l;
        int iOrdinal = c10024l.metrica.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            int iYandex = c10024l.yandex() - 1;
            frameLayout.setPadding(i, iYandex, i, iYandex < i ? i : iYandex);
        } else if (iOrdinal != 2 && iOrdinal != 3) {
            C18725l.billing();
        } else {
            int iLoadAd = c10024l.loadAd() - 1;
            frameLayout.setPadding(iLoadAd, i, iLoadAd, i);
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final /* bridge */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* bridge */ void onResume(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* bridge */ void onStart(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* bridge */ void onStop(InterfaceC3177l interfaceC3177l) {
    }
}
