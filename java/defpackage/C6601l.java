package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: lؙٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6601l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f13820l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final DatagramPacket f13821l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Uri f13822l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public MulticastSocket f13823l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f13824l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f13825l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public DatagramSocket f13826l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f13827l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InetAddress f13828l;

    public C6601l() {
        super(true);
        this.f13824l = 8000;
        byte[] bArr = new byte[2000];
        this.f13827l = bArr;
        this.f13821l = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        this.f13822l = null;
        MulticastSocket multicastSocket = this.f13823l;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f13828l;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f13823l = null;
        }
        DatagramSocket datagramSocket = this.f13826l;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13826l = null;
        }
        this.f13828l = null;
        this.f13820l = 0;
        if (this.f13825l) {
            this.f13825l = false;
            startapp();
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C3645l {
        Uri uri = c2432l.yandex;
        this.f13822l = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f13822l.getPort();
        adcel();
        try {
            this.f13828l = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f13828l, port);
            if (this.f13828l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f13823l = multicastSocket;
                multicastSocket.joinGroup(this.f13828l);
                this.f13826l = this.f13823l;
            } else {
                this.f13826l = new DatagramSocket(inetSocketAddress);
            }
            this.f13826l.setSoTimeout(this.f13824l);
            this.f13825l = true;
            ads(c2432l);
            return -1L;
        } catch (IOException e) {
            throw new C3645l(e, 2001);
        } catch (SecurityException e2) {
            throw new C3645l(e2, 2006);
        }
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C3645l {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13820l;
        DatagramPacket datagramPacket = this.f13821l;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f13826l;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f13820l = length;
                firebase(length);
            } catch (SocketTimeoutException e) {
                throw new C3645l(e, 2002);
            } catch (IOException e2) {
                throw new C3645l(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f13820l;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f13827l, length2 - i4, bArr, i, iMin);
        this.f13820l -= iMin;
        return iMin;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f13822l;
    }
}
