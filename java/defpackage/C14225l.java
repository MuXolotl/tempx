package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: lْٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14225l {
    public boolean adcel;
    public DialogInterface.OnClickListener admob;
    public int ads = -1;
    public CharSequence amazon;
    public String billing;
    public Drawable crashlytics;
    public CharSequence firebase;
    public DialogInterface.OnClickListener isPro;
    public final LayoutInflater loadAd;
    public DialogInterface.OnClickListener metrica;
    public CharSequence mopub;
    public View purchase;
    public DialogInterfaceOnKeyListenerC0001l remoteconfig;
    public DialogInterfaceOnClickListenerC5488l smaato;
    public LinearLayout startapp;
    public CharSequence subs;
    public ListAdapter vip;
    public final ContextThemeWrapper yandex;

    public C14225l(ContextThemeWrapper contextThemeWrapper) {
        this.yandex = contextThemeWrapper;
        this.loadAd = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
