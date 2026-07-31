package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import defpackage.AbstractBinderC5140l;
import defpackage.AbstractC10774l;
import defpackage.AbstractC11738l;
import defpackage.BinderC14844l;
import defpackage.CallableC1988l;
import defpackage.InterfaceC3396l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class FlagProviderImpl extends AbstractBinderC5140l {
    public SharedPreferences billing;
    public boolean purchase;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.purchase = false;
    }

    @Override // defpackage.InterfaceC11842l
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.purchase) {
            return z;
        }
        SharedPreferences sharedPreferences = this.billing;
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            boolValueOf = (Boolean) AbstractC10774l.isVip(new CallableC1988l(sharedPreferences, str, boolValueOf, 0));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.InterfaceC11842l
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.purchase) {
            return i;
        }
        SharedPreferences sharedPreferences = this.billing;
        Integer numValueOf = Integer.valueOf(i);
        try {
            numValueOf = (Integer) AbstractC10774l.isVip(new CallableC1988l(sharedPreferences, str, numValueOf, 1));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // defpackage.InterfaceC11842l
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.purchase) {
            return j;
        }
        SharedPreferences sharedPreferences = this.billing;
        Long lValueOf = Long.valueOf(j);
        try {
            lValueOf = (Long) AbstractC10774l.isVip(new CallableC1988l(sharedPreferences, str, lValueOf, 2));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // defpackage.InterfaceC11842l
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.purchase) {
            return str2;
        }
        try {
            return (String) AbstractC10774l.isVip(new CallableC1988l(this.billing, str, str2, 3));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // defpackage.InterfaceC11842l
    public void init(InterfaceC3396l interfaceC3396l) {
        Context context = (Context) BinderC14844l.m3897l(interfaceC3396l);
        if (this.purchase) {
            return;
        }
        try {
            this.billing = AbstractC11738l.crashlytics(context.createPackageContext("com.google.android.gms", 0));
            this.purchase = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
