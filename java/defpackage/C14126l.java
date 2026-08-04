package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14126l {
    public TextView Signature;
    public ListAdapter ad;
    public Message adcel;
    public NestedScrollView ads;
    public CharSequence amazon;
    public final int applovin;
    public final boolean appmetrica;
    public AlertController$RecycleListView billing;
    public final Window crashlytics;
    public Message firebase;
    public final HandlerC2628l inmobi;
    public CharSequence isPro;
    public final int isVip;
    public TextView license;
    public final DialogInterfaceC13913l loadAd;
    public Button metrica;
    public LinearLayout mopub;
    public final int premium;
    public View pro;
    public String purchase;
    public CharSequence remoteconfig;
    public final int signatures;
    public Button smaato;
    public CharSequence startapp;
    public Button subs;
    public Drawable subscription;
    public ImageView tapsense;
    public Message vip;
    public final Context yandex;
    public boolean admob = false;
    public int advert = -1;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final ViewOnClickListenerC10659l f27625throws = new ViewOnClickListenerC10659l(1, this);

    public C14126l(Context context, DialogInterfaceC13913l dialogInterfaceC13913l, Window window) {
        this.yandex = context;
        this.loadAd = dialogInterfaceC13913l;
        this.crashlytics = window;
        HandlerC2628l handlerC2628l = new HandlerC2628l();
        handlerC2628l.loadAd = new WeakReference(dialogInterfaceC13913l);
        this.inmobi = handlerC2628l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC14657l.purchase, R.attr.alertDialogStyle, 0);
        this.isVip = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.signatures = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.premium = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.applovin = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.appmetrica = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC13913l.billing().isPro(1);
    }

    public static ViewGroup loadAd(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static boolean yandex(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (yandex(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void crashlytics(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.inmobi.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.startapp = charSequence;
            this.adcel = messageObtainMessage;
        } else if (i == -2) {
            this.remoteconfig = charSequence;
            this.vip = messageObtainMessage;
        } else if (i != -1) {
            C8339l.metrica("Button does not exist");
        } else {
            this.isPro = charSequence;
            this.firebase = messageObtainMessage;
        }
    }
}
