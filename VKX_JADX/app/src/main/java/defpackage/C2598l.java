package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lْؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2598l {
    public final byte[] amazon;
    public final long crashlytics;
    public final int loadAd;
    public final int yandex;

    public C2598l(long j, byte[] bArr, int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = j;
        this.amazon = bArr;
    }

    public static C2598l amazon(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C17769l.f34604throws[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i2 : iArr) {
            byteBufferWrap.putShort((short) i2);
        }
        return new C2598l(3, iArr.length, byteBufferWrap.array());
    }

    public static C2598l crashlytics(C4601l[] c4601lArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C17769l.f34604throws[5] * c4601lArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C4601l c4601l : c4601lArr) {
            byteBufferWrap.putInt((int) c4601l.yandex);
            byteBufferWrap.putInt((int) c4601l.loadAd);
        }
        return new C2598l(5, c4601lArr.length, byteBufferWrap.array());
    }

    public static C2598l loadAd(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C17769l.f34604throws[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j2 : jArr) {
            byteBufferWrap.putInt((int) j2);
        }
        return new C2598l(4, jArr.length, byteBufferWrap.array());
    }

    public static C2598l yandex(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C17769l.f34603throw);
        return new C2598l(2, bytes.length, bytes);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [lؗؒۦ[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [lؗؒۦ[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    public final Serializable admob(ByteOrder byteOrder) throws Throwable {
        C9115l c9115l;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.amazon;
        InputStream inputStream2 = null;
        try {
            try {
                c9115l = new C9115l(bArr);
                try {
                    c9115l.f18719l = byteOrder;
                    int i = this.yandex;
                    int length = 0;
                    int i2 = this.loadAd;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, C17769l.f34603throw);
                                try {
                                    c9115l.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c9115l.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= C17769l.f34599package.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C17769l.f34599package;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    c9115l.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            c9115l.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c9115l.readUnsignedShort();
                                length++;
                            }
                            try {
                                c9115l.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) c9115l.readInt()) & 4294967295L;
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 5:
                            r13 = new C4601l[i2];
                            while (length < i2) {
                                r13[length] = new C4601l(((long) c9115l.readInt()) & 4294967295L, ((long) c9115l.readInt()) & 4294967295L);
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c9115l.readShort();
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c9115l.readInt();
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 10:
                            r13 = new C4601l[i2];
                            while (length < i2) {
                                r13[length] = new C4601l(c9115l.readInt(), c9115l.readInt());
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c9115l.readFloat();
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c9115l.readDouble();
                                length++;
                            }
                            c9115l.close();
                            return r13;
                        default:
                            try {
                                c9115l.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c9115l != null) {
                        try {
                            c9115l.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                c9115l = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final int billing(ByteOrder byteOrder) {
        Object objAdmob = admob(byteOrder);
        if (objAdmob == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objAdmob instanceof String) {
            return Integer.parseInt((String) objAdmob);
        }
        if (objAdmob instanceof long[]) {
            long[] jArr = (long[]) objAdmob;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objAdmob instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objAdmob;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String mopub(ByteOrder byteOrder) throws Throwable {
        Object objAdmob = admob(byteOrder);
        if (objAdmob == null) {
            return null;
        }
        if (objAdmob instanceof String) {
            return (String) objAdmob;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objAdmob instanceof long[]) {
            long[] jArr = (long[]) objAdmob;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objAdmob instanceof int[]) {
            int[] iArr = (int[]) objAdmob;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objAdmob instanceof double[]) {
            double[] dArr = (double[]) objAdmob;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objAdmob instanceof C4601l[])) {
            return null;
        }
        C4601l[] c4601lArr = (C4601l[]) objAdmob;
        while (i < c4601lArr.length) {
            sb.append(c4601lArr[i].yandex);
            sb.append('/');
            sb.append(c4601lArr[i].loadAd);
            i++;
            if (i != c4601lArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final double purchase(ByteOrder byteOrder) throws Throwable {
        Object objAdmob = admob(byteOrder);
        if (objAdmob == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objAdmob instanceof String) {
            return Double.parseDouble((String) objAdmob);
        }
        if (objAdmob instanceof long[]) {
            long[] jArr = (long[]) objAdmob;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objAdmob instanceof int[]) {
            int[] iArr = (int[]) objAdmob;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objAdmob instanceof double[]) {
            double[] dArr = (double[]) objAdmob;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objAdmob instanceof C4601l[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C4601l[] c4601lArr = (C4601l[]) objAdmob;
        if (c4601lArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C4601l c4601l = c4601lArr[0];
        return c4601l.yandex / c4601l.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C17769l.inmobi[this.yandex]);
        sb.append(", data length:");
        return AbstractC14814l.remoteconfig(this.amazon.length, ")", sb);
    }

    public C2598l(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
